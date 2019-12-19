package com.qyd.learn.show.leetcode;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/19 15:29
给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。

'.' 匹配任意单个字符
'*' 匹配零个或多个前面的那一个元素
所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。

说明:

s 可能为空，且只包含从 a-z 的小写字母。
p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
示例 1:

输入:
s = "aa"
p = "a"
输出: false
解释: "a" 无法匹配 "aa" 整个字符串。
示例 2:

输入:
s = "aa"
p = "a*"
输出: true
解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
示例 3:

输入:
s = "ab"
p = ".*"
输出: true
解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
示例 4:

输入:
s = "aab"
p = "c*a*b"
输出: true
解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
示例 5:

输入:
s = "mississippi"
p = "mis*is*p*."
输出: false

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/regular-expression-matching
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode010 {
    static  class Solution {
        public boolean isMatch(String s, String p) {
            //如果输入为空，返回匹配失败
            if(s==null|| p==null) return false;

            return match(s.toCharArray(), p.toCharArray(), 0, 0);
        }


        private boolean match(char[] str, char[] pattern, int strIndex, int patIndex) {
            //如果字符串和模式同时遍历完成，说明匹配成功
            if(strIndex == str.length && patIndex == pattern.length)
                return true;
            //如果字符串还没有遍历完，模式已经遍历完，说明匹配失败
            if(strIndex != str.length && patIndex == pattern.length)
                return false;

            //【1】当模式中的第二个字符是“*”时：
            if(patIndex < pattern.length - 1 && pattern[patIndex + 1] == '*') {
                //2、如果字符串第一个字符跟模式第一个字符匹配(相同或者模式为'.')，可以有3种匹配方式：
                if(strIndex < str.length && (pattern[patIndex] == str[strIndex]
                        || pattern[patIndex] == '.')) {
                    //（2）字符串后移1字符，模式后移2字符；
                    return     match(str, pattern, strIndex + 1, patIndex + 2)
                            //（3）字符串后移1字符，模式不变，即继续匹配字符下一位，因为*可以匹配多位；
                            || match(str, pattern, strIndex + 1, patIndex)
                            //（1）模式后移2字符，相当于x*被忽略；
                            || match(str, pattern, strIndex, patIndex + 2);
                } else {
                    //1、如果字符串第一个字符跟模式第一个字符不匹配，则模式后移2个字符，继续匹配。
                    return match(str, pattern, strIndex, patIndex + 2);
                }
            }
            //【2】当模式中的第二个字符不是“*”时：tips!!!切记要把对下标的合法性检查放在&&左侧
            if(strIndex < str.length && (pattern[patIndex] == str[strIndex]
                    || pattern[patIndex] == '.')) {
                //1、如果字符串第一个字符和模式中的第一个字符相匹配
                return match(str, pattern, strIndex + 1, patIndex + 1);
            }
            //2、如果字符串第一个字符和模式中的第一个字符相不匹配，直接返回false
            return false;
        }

    }
}
