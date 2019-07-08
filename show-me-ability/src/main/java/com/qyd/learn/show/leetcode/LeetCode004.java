package com.qyd.learn.show.leetcode;

/**
 * @Auther: qiuyd
 * @Date: 2019/7/2 18:24
 * @Description:
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 * 在真实的面试中遇到过这道题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode004 {
    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            double retDouble=0;
            int midNum1=0;

            int[] merge=merge2Array(nums1,nums2);

            //3   1,2,4

            int mid=merge.length/2;
            if(merge.length%2==0){

                int other=mid-1;
                retDouble=(double)(merge[mid]+merge[other])/2;
            }else{
                retDouble=merge[mid];
            }

            return  retDouble;
        }

        private int[] merge2Array(int[] nums1,int[] nums2) {

            if(nums1.length==0){
                return nums2;
            }
            if(nums2.length==0){
                return nums1;
            }

            int[] merge=new int[nums1.length+nums2.length];

            int indexNum1=0;
            int indexNum2=0;

            for(int i=0;i<nums1.length;i++){
                merge[i]=nums1[i];
            }

            for(int i=0;i<nums2.length;i++){
                insert(nums2[i],merge,nums1.length+i-1);
            }

            return merge;
        }

        private void insert(int val, int[] merge,int size) {
            int start=0;
            int end=size;
          //2,5,8     4


            while (start<=end){
                int mid=(start+end)/2;
                if(merge[mid]>val){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

            //start
            int position=start;

            for (int j=size;j>=start;j--){
                merge[j+1]=merge[j];
            }

            merge[position]=val;

        }
    }

}
