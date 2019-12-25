package com.qyd.learn.show.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/25 14:55
 * @Description:
 *
 * 给定一个字符串 s 和一些长度相同的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 *
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：
 *   s = "barfoothefoobarman",
 *   words = ["foo","bar"]
 * 输出：[0,9]
 * 解释：
 * 从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
 * 输出的顺序不重要, [9,0] 也是有效答案。
 * 示例 2：
 *
 * 输入：
 *   s = "wordgoodgoodgoodbestword",
 *   words = ["word","good","best","word"]
 * 输出：[]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode030串联所有单词的子串 {
    static class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            List<Integer> res = new ArrayList<Integer>();
            if (words.length == 0) return res;
            int wl = words[0].length();
            int wc = words.length;
            int win = wc * wl;

            Map<String,Integer> map1 = new HashMap<String,Integer>();
            for (String w:words) {
                if (map1.get(w)==null) map1.put(w,0);
                map1.put(w, map1.get(w)+1);
            }

            int[] wordNums = new int[map1.size()];
            int i = 0;
            for (Integer n:map1.values()) {
                wordNums[i] = n;
                i++;
            }

            int[] f=new int[s.length()];
            int wn=1;
            for(String w:map1.keySet()) {
                int index = -2;
                while(index != -1) {
                    if (index == -2) index=-1;
                    index = s.indexOf(w, index+1);
                    if (index >=0) f[index] = wn;
                }
                wn++;
            }

            int[] wordNumsWin = new int[map1.size()];
            for (int j=0;j+win<=s.length();j++) {
                while(f[j]==0) {
                    j++;
                    if(j+win>s.length()) return res;
                }
                int k=j;
                while(k<j+win) {
                    if(f[k] != 0) {
                        wordNumsWin[f[k]-1]++;
                        if (wordNumsWin[f[k]-1] > wordNums[f[k]-1]) break;
                    }else break;
                    k+=wl;
                }
                if (k==j+win) {
                    //compare
                    int mm=0;
                    for (;mm<map1.size();mm++) {
                        if (wordNumsWin[mm] != wordNums[mm]) break;
                    }
                    if (mm==map1.size()) res.add(j);
                }
                // clean the wordNumsWin
                for (int mm=0;mm<map1.size();mm++) wordNumsWin[mm] = 0;
            }

            return res;
        }
    }
}
