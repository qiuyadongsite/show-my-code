package com.qyd.learn.show.leetcode;

import java.util.*;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/21 15:09
 * @Description:电话号码的字母组合
 *
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LeetCode017 {
    static class Solution {
        public List<String> letterCombinations(String digits) {

            List<String> retList=new ArrayList<>();

            Map<Integer,List<Character>> info=new HashMap<>();

            info.put(2, Arrays.asList('a','b','c'));
            info.put(3, Arrays.asList('d','e','f'));
            info.put(4, Arrays.asList('g','h','i'));
            info.put(5, Arrays.asList('j','k','l'));
            info.put(6, Arrays.asList('m','n','o'));
            info.put(7, Arrays.asList('p','q','r','s'));
            info.put(8, Arrays.asList('t','u','v'));
            info.put(9, Arrays.asList('w','x','y','z'));

            List<List<Character>> list=new ArrayList<>();
            for(int i=0;i<digits.length();i++){
                int key=Integer.valueOf(digits.charAt(i)+"");
                list.add(info.get(key));
            }
            int sizeV=list.size();
            for(int i=0;i<sizeV;i++){
                List<Character> characters1 = list.get(i);
                if(retList.size()==0){
                    for(int j=0;j<characters1.size();j++){
                        retList.add(characters1.get(j)+"");
                    }
                }else{
                    int size=retList.size();
                    List<String> ret=new ArrayList<>();
                    for(int j=0;j<size;j++){
                        String v1=retList.get(j);
                        for(int k=0;k<characters1.size();k++){
                            ret.add(v1+characters1.get(k));
                        }

                    }
                    retList=ret;
                }
            }




            return retList;
        }
    }
}
