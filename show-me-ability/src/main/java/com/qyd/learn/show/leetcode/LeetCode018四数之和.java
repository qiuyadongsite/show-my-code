package com.qyd.learn.show.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/21 16:23
 * @Description:给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *
 * 注意：
 *
 * 答案中不可以包含重复的四元组。
 *
 * 示例：
 *
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/4sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode018四数之和{
    static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {

           /* List<List<Integer>> ret=new ArrayList<>();

            Arrays.sort(nums);
            if(nums.length<4){
                return ret;
            }
            for(int i=0;i<nums.length;i++){
                if(i>0&&nums[i]==nums[i-1]){
                    continue;
                }
                int L=i+1;
                int R=nums.length-1;
                int LR=nums.length-2;
                boolean isCicle=false;
                boolean isZero=false;
                while (L<LR&&LR<R){
                    int key=nums[i]+nums[L]+nums[LR]+nums[R];

                    if(key>target){
                        if((LR-1)!=L){
                            if(isCicle){
                                R--;
                            }else{
                                LR--;
                            }

                        }else{
                            R--;
                        }
                    }else if(key<target){
                        if((LR-1)!=L){
                            L++;
                        }else{
                            isCicle=true;
                            LR++;
                        }
                    }else{
                        if(ret.size()>0) {
                            List<Integer> integers = ret.get(ret.size() - 1);
                            if ((integers.get(0) == nums[i]) && (integers.get(1) == nums[L]) && (integers.get(2) == nums[LR])) {

                            } else {
                                ret.add(Arrays.asList(nums[i], nums[L], nums[LR], nums[R]));
                            }
                        }else{
                            ret.add(Arrays.asList(nums[i], nums[L], nums[LR], nums[R]));
                        }
                        if((L+1)!=LR){
                            if(isZero){
                                L++;
                            }else{
                                LR++;
                            }


                        }else{
                            if((LR+1)!=R){
                                if(!isZero){
                                    LR++;
                                    isZero=true;
                                }else{
                                    R--;
                                }

                            }


                        }




                    }
                }
            }

            return ret;
*/
            List<List<Integer>> result=new ArrayList<>();
            /*当数组为null或元素小于4个时，直接返回*/
            if(nums==null||nums.length<4){
                return result;
            }
            /*对数组进行从小到大排序*/
            Arrays.sort(nums);
            /*数组长度*/
            int length=nums.length;
            /*定义4个指针k，i，j，h  k从0开始遍历，i从k+1开始遍历，留下j和h，j指向i+1，h指向数组最大值*/
            for(int k=0;k<length-3;k++){
                /*当k的值与前面的值相等时忽略*/
                if(k>0&&nums[k]==nums[k-1]){
                    continue;
                }
                /*获取当前最小值，如果最小值比目标值大，说明后面越来越大的值根本没戏*/
                int min1=nums[k]+nums[k+1]+nums[k+2]+nums[k+3];
                if(min1>target){
                    break;
                }
                /*获取当前最大值，如果最大值比目标值小，说明后面越来越小的值根本没戏，忽略*/
                int max1=nums[k]+nums[length-1]+nums[length-2]+nums[length-3];
                if(max1<target){
                    continue;
                }
                /*第二层循环i，初始值指向k+1*/
                for(int i=k+1;i<length-2;i++){
                    /*当i的值与前面的值相等时忽略*/
                    if(i>k+1&&nums[i]==nums[i-1]){
                        continue;
                    }
                    /*定义指针j指向i+1*/
                    int j=i+1;
                    /*定义指针h指向数组末尾*/
                    int h=length-1;
                    /*获取当前最小值，如果最小值比目标值大，说明后面越来越大的值根本没戏，忽略*/
                    int min=nums[k]+nums[i]+nums[j]+nums[j+1];
                    if(min>target){
                        continue;
                    }
                    /*获取当前最大值，如果最大值比目标值小，说明后面越来越小的值根本没戏，忽略*/
                    int max=nums[k]+nums[i]+nums[h]+nums[h-1];
                    if(max<target){
                        continue;
                    }
                    /*开始j指针和h指针的表演，计算当前和，如果等于目标值，j++并去重，h--并去重，当当前和大于目标值时h--，当当前和小于目标值时j++*/
                    while (j<h){
                        int curr=nums[k]+nums[i]+nums[j]+nums[h];
                        if(curr==target){
                            result.add(Arrays.asList(nums[k],nums[i],nums[j],nums[h]));
                            j++;
                            while(j<h&&nums[j]==nums[j-1]){
                                j++;
                            }
                            h--;
                            while(j<h&&i<h&&nums[h]==nums[h+1]){
                                h--;
                            }
                        }else if(curr>target){
                            h--;
                        }else {
                            j++;
                        }
                    }
                }
            }
            return result;

        }
    }
}
