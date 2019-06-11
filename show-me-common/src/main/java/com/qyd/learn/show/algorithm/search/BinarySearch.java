package com.qyd.learn.show.algorithm.search;

import com.qyd.learn.show.algorithm.sort.SelectSort;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/11 09:27
 * @Description:
 */
public class BinarySearch extends BaseSearch{
    @Override
    protected int doSearch(int[] a, int value) {

     /*   int b=recur(a,value,0,a.length-1);*/

        int b=nonRecur(a,value);
        return b;
    }

    //非递归
    private int nonRecur(int[] a, int value) {

        int left=0;
        int right=a.length-1;
        while (true){

            int half=(left+right)/2;

            if(left==right){
                if(a[half]==value){
                    return half;
                }else{
                    return -1;
                }
            }else{
                if(a[half]==value){
                    return half;
                }else if(a[half]>value){
                    right=half-1;
                }else{
                    left=half+1;
                }
            }
        }
    }

    //递归
    private int recur(int[] a, int value,int left,int right) {
        int half=(left+right)/2;
        if(left<right) {
            if (a[half] == value) {
                return half;
            } else if (a[half] < value) {
                return recur(a, value, half+1, right);
            } else {
                return recur(a, value, left, half-1);
            }
        }else{
            if (a[half] == value) {
                return half;
            }else{
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();
        SelectSort selectSort=new SelectSort();
        int[] ints = selectSort.doSort(binarySearch.getA());
        binarySearch.search(ints,24);
    }
}
