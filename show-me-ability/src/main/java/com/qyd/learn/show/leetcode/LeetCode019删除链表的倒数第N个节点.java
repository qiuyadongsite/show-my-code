package com.qyd.learn.show.leetcode;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/23 09:36
 * @Description:给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode019删除链表的倒数第N个节点 {

    public static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }

   static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode ret=head;
            if(head==null){
                return ret;
            }
            int size=0;
            while (head!=null){
                head=head.next;
                size++;
            }
            int k=size-n;
            int nS=0;
            if(size==1&&n>=1){
                return null;
            }
            head=ret;
            ListNode r=ret;
            if(size==n){
                return ret.next;
            }
            while (head!=null){
                nS++;
                if(nS!=k){
                  ret.next=head.next;
                  ret=ret.next;
                }
                head=head.next;
            }

            return r;


        }
    }
}
