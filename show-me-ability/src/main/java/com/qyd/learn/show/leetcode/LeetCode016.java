package com.qyd.learn.show.leetcode;

import java.util.Arrays;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/21 14:14
 * @Description:最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode016 {
    static class Solution {
        public int threeSumClosest(int[] nums, int target) {

            int retInt=target;

            if(nums.length<=3){
                int max=0;
                for(int i=0;i<nums.length;i++){
                    max+=nums[i];
                }
                return max;
            }
            Arrays.sort(nums);
            int miuX=Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(i>0&&nums[i]==nums[i-1]){
                    continue;
                }
                int Left=i+1;
                int Right=nums.length-1;
                while (Left<Right){
                    int key=nums[i]+nums[Left]+nums[Right];
                    int miu=key-target;

                    if(miu<0){
                       Left++;
                       if(miu*-1<miuX){
                           retInt=key;
                           miuX=miu*-1;
                       }

                    }else if(miu>0){
                        Right--;
                        if(miu<miuX){
                            retInt=key;
                            miuX=miu;
                        }
                    }else{
                        return key;

                    }
                   /* while (Left<Right&&nums[Left]==nums[Left+1]){
                        Left++;
                    }
                    while (Left<Right&&nums[Right]==nums[Right-1]){
                        Right--;
                    }*/
                }
            }


            return retInt;
        }
    }
}
