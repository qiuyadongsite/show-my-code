package com.qyd.learn.show.leetcode;

import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2019/7/1 14:07
 * @Description:
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode002 {
    static class ListNode {
         int val;
          ListNode next;
          ListNode(int x) { val = x; }

       @Override
        public String toString() {

            return this.val+"";
        }
        public String list() {

              String ret="";
            ListNode o=this;

            while (o!=null){
                ret+=o.val+"->";
                o=o.next;
            }

            return ret;
        }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            if(l1.val==0&&l1.next==null){
                return l2;
            }
            if(l2.val==0&&l2.next==null){
                return l1;
            }

            ListNode l11=l1;
            ListNode l22=l2;



            ListNode ret=new ListNode(0);
            ListNode head=ret;
            int jin=0;

            while (l11!=null||l22!=null){
                if(l11==null){
                    int x=l22.val+jin;
                    if(x>9){
                        jin=1;
                        x=x-10;
                    }else{
                        jin=0;
                    }
                    l22=l22.next;
                    ListNode kk=new ListNode(x);
                    ret.next=kk;
                    ret=ret.next;
                    continue;
                }
                if(l22==null){
                    int x=l11.val+jin;
                    if(x>9){
                        jin=1;
                        x=x-10;
                    }else{
                        jin=0;
                    }
                    l11=l11.next;
                    ListNode kk=new ListNode(x);
                    ret.next=kk;
                    ret=ret.next;
                    continue;
                }
                if(l22!=null&&l11!=null){
                    int x=l11.val+l22.val+jin;
                    if(x>9){
                        jin=1;
                        x=x-10;
                    }else{
                        jin=0;
                    }
                    l11=l11.next;
                    l22=l22.next;
                    ListNode kk=new ListNode(x);
                    ret.next=kk;
                    ret=ret.next;

                }
            }

            if(jin>0){
                ret.next=new ListNode(1);
            }

            return head.next;
        }
        //反转链表
        private ListNode reverse(ListNode l2) {
            ListNode cur=l2;
            ListNode pre=null;
            ListNode next=null;
            while (cur!=null){
               next=cur.next;
               cur.next=pre;
               pre=cur;
               cur=next;


            }
            return pre;
        }
    }
}
