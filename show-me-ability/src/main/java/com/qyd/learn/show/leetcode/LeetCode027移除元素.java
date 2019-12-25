package com.qyd.learn.show.leetcode;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/25 14:00
 * @Description:
 */
public class LeetCode027移除元素 {
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int size=0;
            if(nums.length==0||nums.length==1){
                if(nums.length==1){
                    if(nums[0]==val){
                        return 0;
                    }else{
                        return 1;
                    }
                }else{
                    return 0;
                }
            }
            for(int i=0,k=0;i<nums.length&&k<nums.length;i++,k++){
                if(nums[i]==val){
                    for(int j=i;j<nums.length-1;j++){
                        nums[j]=nums[j+1];
                    }
                    size++;
                    i--;
                }
            }
            return nums.length-size;

        }
    }
}
