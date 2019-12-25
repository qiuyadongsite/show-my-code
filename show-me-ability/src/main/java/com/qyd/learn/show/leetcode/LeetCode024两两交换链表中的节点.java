package com.qyd.learn.show.leetcode;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/24 09:40
 * @Description:
 *
 */
public class LeetCode024两两交换链表中的节点 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
     public static class ListNode {
         int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
   static class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode next = head.next;
            head.next = swapPairs(next.next);
            next.next = head;
            return next;

        }
    }
}
