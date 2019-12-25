package com.qyd.learn.show.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/23 14:02
 * @Description:
 *
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode022括号生成 {
    static class Solution {
        public List<String> generateParenthesis(int n) {
            LinkedList<LinkedList<String>> result = new LinkedList<LinkedList<String>>();
            if (n == 0)
                return result.get(0);
            LinkedList<String> list0 = new LinkedList<String>();
            list0.add("");
            result.add(list0);
            LinkedList<String> list1 = new LinkedList<String>();
            list1.add("()");
            result.add(list1);
            for (int i = 2; i <= n; i++) {
                LinkedList<String> temp = new LinkedList<String>();
                for (int j = 0; j < i; j++) {
                    List<String> str1 = result.get(j);
                    List<String> str2 = result.get(i - 1 - j);
                    for (String s1 : str1) {
                        for (String s2 : str2) {
                            String el = "(" + s1 + ")" + s2;
                            temp.add(el);
                        }
                    }

                }
                result.add(temp);
            }
            return result.get(n);

        }
    }
}
