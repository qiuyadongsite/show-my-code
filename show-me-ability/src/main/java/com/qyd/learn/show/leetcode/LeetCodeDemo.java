package com.qyd.learn.show.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2019/7/1 13:49
 * @Description:
 */
public class LeetCodeDemo {
    public static void main(String[] args) {
      /*  testLeetCode001();*/
       /* testLeetCode002();*/
      /*  testLeetCode003();*/
       /* testLeetCode004();*/

       /* testLeetCode005();*/
       /* testLeetCode006();*/
      /*  testLeetCode007();*/
     /*   testLeetCode008();*/
      /*  testLeetCode012();*/
      /*  testLeetCode013();  */

        /*testLeetCode014();*/
    /*    testLeetCode016();*/
       /* testLeetCode017();*/
       /* testLeetCode018();*/
        /*testLeetCode019();*/
     /*   testLeetCode020();*/
      /*  testLeetCode022();*/
    /*    testLeetCode025();*/
     /*   testLeetCode026(); */
      /*  testLeetCode027();*/
      /*  testLeetCode028();*/
        testLeetCode030();
    /*    testLeetCode015();*/

    }

    private static void testLeetCode030() {

        // "wordgoodgoodgoodbestword"
        //["word","good","best","word"]
//"barfoothefoobarman"
//["foo","bar"]
        //"wordgoodgoodgoodbestword"
        //["word","good","best","good"]

        ///"ababaab"
        //["ab","ba","ba"]
        System.out.println(new LeetCode030串联所有单词的子串.Solution().findSubstring("ababaab",
                new String[]{"ab","ba","ba"}));
    }

    private static void testLeetCode026() {
        //给定 nums = [0,0,1,1,1,2,2,3,3,4],
        System.out.println(new LeetCode026删除排序数组中的重复项.Solution().removeDuplicates(new int[]{1,1,2}));
    }
     private static void testLeetCode027() {
        //给定nums = [3,2,2,3], val = 3,
        System.out.println(new LeetCode027移除元素.Solution().removeElement(new int[]{3,2,2,3},2));
    }
  private static void testLeetCode028() {
        //给定LeetCode028实现strStr"mississippi"
      //"pi"
        System.out.println(new LeetCode028实现strStr.Solution().strStr("mississippi","pi"));
    }

    private static void testLeetCode025() {
        LeetCode024两两交换链表中的节点.ListNode l1 = new LeetCode024两两交换链表中的节点.ListNode(1);
        LeetCode024两两交换链表中的节点.ListNode l2 = new LeetCode024两两交换链表中的节点.ListNode(2);
        LeetCode024两两交换链表中的节点.ListNode l3 = new LeetCode024两两交换链表中的节点.ListNode(3);
        LeetCode024两两交换链表中的节点.ListNode l4 = new LeetCode024两两交换链表中的节点.ListNode(4);
        LeetCode024两两交换链表中的节点.ListNode l5 = new LeetCode024两两交换链表中的节点.ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        new LeetCode024两两交换链表中的节点.Solution().swapPairs(l1);
    }

    private static void testLeetCode022() {
        List<String> strings = new LeetCode022括号生成.Solution().generateParenthesis(3);
        for(String s:strings){
            System.out.println(s);
        }

        System.out.println();
    }
    private static void testLeetCode020() {
        System.out.println(new LeetCode020有效的括号.Solution().isValid("(}"));
    }
    private static void testLeetCode019() {
        //[-3,-2,-1,0,0,1,2,3]
        //0
        LeetCode019删除链表的倒数第N个节点.ListNode r1=new LeetCode019删除链表的倒数第N个节点.ListNode(1);
        LeetCode019删除链表的倒数第N个节点.ListNode r2=new LeetCode019删除链表的倒数第N个节点.ListNode(2);
        LeetCode019删除链表的倒数第N个节点.ListNode r3=new LeetCode019删除链表的倒数第N个节点.ListNode(3);
        LeetCode019删除链表的倒数第N个节点.ListNode r4=new LeetCode019删除链表的倒数第N个节点.ListNode(4);
        LeetCode019删除链表的倒数第N个节点.ListNode r5=new LeetCode019删除链表的倒数第N个节点.ListNode(5);
        r1.next=r2;
        /*r2.next=r3;
        r3.next=r4;
        r4.next=r5;*/

        System.out.println(new LeetCode019删除链表的倒数第N个节点.Solution().removeNthFromEnd(r1,2));
    }
   private static void testLeetCode018() {
        //[-3,-2,-1,0,0,1,2,3]
        //0
        System.out.println(new LeetCode018四数之和.Solution().fourSum(new int[]{-3,-2,-1,0,0,1,2,3},0));
    }
    private static void testLeetCode017() {
        //M[1,0,-1,0,-2,2]
        //0
        System.out.println(new LeetCode017.Solution().letterCombinations("23"));
    }
    private static void testLeetCode016() {
        //MCMXCIV[-1,0,1,1,55]
        //3
        //1
        //1
       int ret=new LeetCode016.Solution().threeSumClosest(new int[]{-1,0,1,1,55},3);
        System.out.println(ret);
    }

    private static void testLeetCode015() {
        //MCMXCIV
        List<List<Integer>> lists = new LeetCode015N.Solution().threeSum(new int[]{0,1,1});
        System.out.println(lists);
    }

    private static void testLeetCode014() {
        //MCMXCIV
        System.out.println(new LeetCode014.Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    private static void testLeetCode013() {
        //MCMXCIV
        System.out.println(new LeetCode013.Solution().romanToInt("MCMXCIV"));
    }

    private static void testLeetCode012() {


        String ret=new LeetCode012.Solution().intToRoman(4);
        System.out.println(ret);//"PAHNAPLSIIGYIR"

    }

    private static void testLeetCode011() {


        int ret=new LeetCode011.Solution().maxArea(new int[]{ 1,8,6,2,5,4,8,3,7});
        System.out.println(ret);//"PAHNAPLSIIGYIR"

    }  private static void testLeetCode008() {

        int ret=new LeetCode008.Solution().myAtoi("20000000000000000000");
        System.out.println(ret);//"PAHNAPLSIIGYIR"

    }
    private static void testLeetCode007() {

        int ret=new LeetCode007.Solution().reverse(-2147483412);
        System.out.println(ret);//"PAHNAPLSIIGYIR"

    }
    private static void testLeetCode006() {
        String s="AB" ;
        String ret=new LeetCode006.Solution().convert(s,1);
        System.out.println(ret);//"PAHNAPLSIIGYIR"

    }
    private static void testLeetCode005() {
        String s="qeasdfsadfsadfwerwqesadfsadasdfsadfsa";
        String ret=new LeetCode005.Solution().longestPalindrome(s);
        System.out.println(ret);

    }



    private static void testLeetCode004() {
// * nums1 = [1, 3]
// * nums2 = [2]
// *
// * 则中位数是 2.0
// * 示例 2:
// *
// * nums1 = [1, 2]
// * nums2 = [3, 4]
// *
// * 则中位数是 (2 + 3)/2 = 2.5

        int[] num1=new int[]{1,2};
        int[] num2=new int[]{-1,3};

        double medianSortedArrays = new LeetCode004.Solution().findMedianSortedArrays(num1, num2);

        System.out.println(medianSortedArrays);
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
