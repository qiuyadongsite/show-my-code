package com.qyd.learn.show.leetcode;

import java.util.Arrays;

/**
 * @Auther: qiuyd
 * @Date: 2019/7/1 13:49
 * @Description:
 */
public class LeetCodeDemo {
    public static void main(String[] args) {
      /*  testLeetCode001();*/
       /* testLeetCode002();*/
        testLeetCode003();

    }

    private static void testLeetCode003() {
        String s="";
        int retint=new LeetCode003.Solution().lengthOfLongestSubstring(s);
        System.out.println(retint);
    }

    private static void testLeetCode002() {





        LeetCode002.ListNode l1=new LeetCode002.ListNode(2);
        l1.next=new LeetCode002.ListNode(4);
        l1.next.next=new LeetCode002.ListNode(3);

        LeetCode002.ListNode l2=new LeetCode002.ListNode(5);
        l2.next=new LeetCode002.ListNode(6);
        l2.next.next=new LeetCode002.ListNode(4);

       /* LeetCode002.ListNode l1=new LeetCode002.ListNode(0);

        LeetCode002.ListNode l2=new LeetCode002.ListNode(7);
        l2.next=new LeetCode002.ListNode(3);
*/
       /* LeetCode002.ListNode l1=new LeetCode002.ListNode(1);
        l1.next=new LeetCode002.ListNode(8);
        LeetCode002.ListNode l2=new LeetCode002.ListNode(0);*/
       /* LeetCode002.ListNode l1=new LeetCode002.ListNode(9);
        l1.next=new LeetCode002.ListNode(8);
        LeetCode002.ListNode l2=new LeetCode002.ListNode(1  );*/

        System.out.println(new LeetCode002.Solution().addTwoNumbers(l1,l2).list());
    }

    private static void testLeetCode001() {
        int[] leetCode001nums=new int[]{2, 7, 11, 15};
        int leetCode001target=9;
        int[] retint=new LeetCode001.Solution().twoSum(leetCode001nums,leetCode001target);
        System.out.println(Arrays.toString(retint));;
    }
}
