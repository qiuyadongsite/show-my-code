package com.qyd.learn.show.leetcode;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/20 14:08
 * @Description:最长公共前缀
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode014 {
    static class Solution {
        public String longestCommonPrefix(String[] strs) {

            if(strs.length<2){
                if(strs.length==1){
                    return strs[0];
                }else{
                    return "";
                }
            }
            int commonSize=strs[0].length();
            String commonPre=strs[0];
            int index=0;
            for(int i=1;i<strs.length;i++){
                if(strs[i].length()<commonSize){
                    index=i;
                    commonPre=strs[i];
                    commonSize=commonPre.length();
                }
            }
           for(int i=0;i<strs.length;i++){
               if(i==index){
                   continue;
               }
               String str=strs[i];

               for(int j=0;j<commonSize;j++){
                   if(str.charAt(j)!=commonPre.charAt(j)){
                       commonSize=j;
                       break;
                   }
               }
           }

            return commonPre.substring(0,commonSize);

        }
    }
}
    /*
          执行用时 :
6 ms
, 在所有 java 提交中击败了
6.34%
的用户
内存消耗 :
38.5 MB
, 在所有 java 提交中击败了
52.05%
的用户

          String pre="";
            if(strs==null||strs.length<2){
                if(strs.length==1){
                    return strs[0];
                }else{
                    return "";
                }

            }

            int maxSize=strs[0].length();
            for(int i=0;i<strs.length-1;i++){
                String s1=strs[i];
                String s2=strs[i+1];
                int len=s1.length()>s2.length()?s2.length():s1.length();
                if(len==0){
                    return "";
                }
                for(int j=1;j<=len;j++){
                    if(!s1.substring(0,j).equals(s2.substring(0,j))){
                        if(j<=maxSize){
                            maxSize=j-1;
                        }
                        break;
                    }else{
                        if(j==len){
                            if(j<=maxSize){
                                maxSize=j;
                            }
                        }
                    }
                }
            }

            return maxSize<=0?"":strs[0].substring(0,maxSize);*/


/**执行用时 :
 1 ms
 , 在所有 java 提交中击败了
 87.85%
 的用户
 内存消耗 :
 37.9 MB
 , 在所有 java 提交中击败了
 67.30%
 的用户**/
         /*   if (strs == null || strs.length < 2) {
        if (strs.length == 1) {
        return strs[0];
        } else {
        return "";
        }
        }
        int preSize = strs[0].length();
        int preIndex = 0;
        for (int i = 1; i < strs.length; i++) {
        if (strs[i].length() < preSize) {
        preSize = strs[i].length();
        preIndex = i;
        }
        }
        for (int i = 0; i < strs.length; i++) {
        if (i == preIndex) {
        continue;
        }
        if(preSize==0)
        {break;}
        for(int j=0;j<preSize;j++){
        char k=strs[preIndex].charAt(j);
        if(strs[i].charAt(j)!=k){

        if(j<preSize){
        preSize=j;
        }
        }
        }
        }
        return strs[preIndex].substring(0,preSize);*/