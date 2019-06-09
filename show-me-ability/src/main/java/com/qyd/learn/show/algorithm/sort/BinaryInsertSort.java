package com.qyd.learn.show.algorithm.sort;

/**
 * 二分法插入排序，按照二分查找插入
 */
public class BinaryInsertSort {
    public static void main(String[] args) {
        int[] a={12,23,1,2,42,16,33,121,65,8};
        BinaryInsertSort ibinaryInsertSort=new BinaryInsertSort();
        ibinaryInsertSort.insetSort(a);
    }

    private void insetSort(int[] a) {

        int[] sortedArray= new int[a.length];

        sortedArray[0]=a[0];

        for (int i=1;i<a.length;i++){
            binaryInsert(sortedArray,i,a[i]);
        }

        for (int n:sortedArray){
            System.out.println(" "+ n);
        }

    }

    /**
     *
     * [12,23]  1
     *
     * @param sortedArray
     * @param i
     * @param data
     */

    private void binaryInsert(int[] sortedArray, int i, int data) {

        if(data>sortedArray[i-1]){
            sortedArray[i] = data;
            return;
        }

        int left=0;
        int right=i;

        while (left<=right){
            int mid=(right+left)/2;
            if(sortedArray[mid]>data){
                right=mid-1;

            }
            if(sortedArray[mid]<data){
                left=mid+1;
            }
        }

        //left为插入位置
        for(int k=i-1;k>=left;k--){
            sortedArray[k+1]=sortedArray[k];

        }
        sortedArray[left]=data;



    }
}
