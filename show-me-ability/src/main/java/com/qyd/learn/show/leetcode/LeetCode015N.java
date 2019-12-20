package com.qyd.learn.show.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/20 15:03
 * @Description:三数之和
 *
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode015N {
    static class Solution {
        public  List<List<Integer>> threeSum(int[] nums) {
           List<List<Integer>> list=new ArrayList<>();
           Arrays.sort(nums);
           for(int i=0;i<nums.length;i++){
               if(i>0&&nums[i]==nums[i-1]){
                   continue;
               }
               int Left=i+1;
               int Right=nums.length-1;
               while (Left<Right){
                   int k=nums[i]+nums[Left]+nums[Right];
                   if(k<0){
                       Left++;
                   }else if(k>0){
                       Right--;
                   }else{
                       list.add(Arrays.asList(nums[i],nums[Left],nums[Right]));
                       Left++;
                       Right--;
                       while(Left<Right&&nums[Left]==nums[Left-1]){
                           Left++;
                       }
                       while (Left<Right&&nums[Right]==nums[Right+1]){
                           Right--;
                       }
                   }
               }
           }
            return list;
        }

    }
}
