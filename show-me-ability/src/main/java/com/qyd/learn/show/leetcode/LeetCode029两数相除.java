package com.qyd.learn.show.leetcode;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/25 14:33
 * @Description:
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 示例 1:
 *
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 示例 2:
 *
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 说明:
 *
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/divide-two-integers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode029两数相除 {
    static class Solution {
        public int divide(int dividend, int divisor) {
            int r=0;
            int sign = (dividend ^ divisor) >> 31;

           /* while (dividend>=divisor){
                dividend=dividend-divisor;
                r++;
            }
            for (int i = 31; i >= 0; i--) {
			if (dividend >> i >= divisor) {
				result += 1 << i;
				//左移一位相当于乘2
				dividend -= divisor << i;
			}
		}

            */


            if (sign == -1) r *= -1;
            if (r < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else if (r > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            return r;

        }
    }
}
