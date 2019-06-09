package com.qyd.learn.show.algorithm.sort;


/**
 * 直接插入排序，将一个数字插入已经排好序的队列
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] a={12,23,1,2,42,16,33,121,65,8};
        InsertSort insertSort=new InsertSort();
        insertSort.insetSort(a);
    }

    private void insetSort(int[] a) {

        int[] sortArray=new int[a.length];

        sortArray[0]=a[0];
        for (int i=1;i<a.length;i++){
            insertSortArry(sortArray,i,a[i]);
        }
        for (int n:sortArray){
            System.out.println(" "+ n);
        }


    }

    /**
     *
     * {12,23,1,2,42,12,33,121,65,8}  [12]
     * @param sortArray
     * @param i
     * @param data
     */

    private void insertSortArry(int[] sortArray, int i, int data) {

        if(sortArray[i-1]<data){
            sortArray[i]=data;
            return;
        }
        int tem=i;
        for(int j=i-1;j>=0;j--){
            if(sortArray[j]>=data){
                sortArray[j+1]=sortArray[j];
                tem=j;
            }else{
                break;
            }
        }
        sortArray[tem]=data;

    }

}
