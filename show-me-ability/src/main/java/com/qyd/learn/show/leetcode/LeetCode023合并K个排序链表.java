package com.qyd.learn.show.leetcode;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/24 09:22
 * @Description:
 *
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-k-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode023合并K个排序链表 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {

            ListNode ret=new ListNode(0);

            if(lists.length==0||lists.length==1){
                if(lists.length==1){
                    return lists[0];
                }else{
                    return null;
                }
            }
            ret=lists[0];
            for(int i=1;i<lists.length;i++){
                ret=merge2List(ret,lists[i]);
            }
            return ret;
        }
        public ListNode merge2List(ListNode root,ListNode other){
            ListNode ret=new ListNode(0);
            ListNode r=ret;
            while (root!=null||other!=null){
                if(root==null){
                    ret.next=other;
                    other=other.next;
                }else  if(other==null){
                    ret.next=root;
                    root=root.next;
                }else if(root.val<=other.val){
                    ret.next=root;
                    root=root.next;
                }else{
                    ret.next=other;
                    other=other.next;
                }
                ret=ret.next;
            }

            return r.next;
        }
    }

}
