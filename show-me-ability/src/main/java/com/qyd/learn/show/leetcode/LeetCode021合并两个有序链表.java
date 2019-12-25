package com.qyd.learn.show.leetcode;

import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/23 10:30
 * @Description:
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode021合并两个有序链表 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode ret=new ListNode(0);

            ListNode r=ret;
            while (l1!=null||l2!=null){
                if(l1!=null&&l2==null){
                    ret.next=l1;
                    break;
                }else
                if(l2!=null&&l1==null){
                    ret.next=l2;
                    break;
                }else{
                    if(l1.val<=l2.val){
                        ret.next=l1;
                        l1=l1.next;
                    }else{
                        ret.next=l2;
                        l2=l2.next;
                    }
                    ret=ret.next;
                }

            }

            return r.next;

        }
    }
}
