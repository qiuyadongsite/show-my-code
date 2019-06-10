package com.qyd.learn.show.algorithm.sort;

/**
 * @Auther: qiuyd 1
 * @Date: 2019/6/10 10:23
 * @Description:二分法插入，mid
 */
public class BinaryInsortSort extends BaseSort {
    @Override
    protected int[] doSort(int[] a) {
        int[] retArray=new int[a.length];
        retArray[0]=a[0];
        for (int i = 1; i < a.length; i++) {
            insertArray(retArray,i,a[i]);
        }
        return retArray;
    }

    /**
     * {23} 1
     * @param retArray
     * @param i
     * @param i1
     */
    private void insertArray(int[] retArray, int i, int i1) {
        if(i1>=retArray[i-1]){
            retArray[i]=i1;
        }else{
            int left=0;
            int right=i-1;
            while (left<=right){
                int mid=(left+right)/2;
                if(retArray[mid]>i1){
                    right=mid-1;
                }
                if(retArray[mid]<i1){
                    left=mid+1;
                }
            }
            for(int j=i;j>left;j--){
                retArray[j]=retArray[j-1];
            }
                retArray[left]=i1;

        }
    }

    public static void main(String[] args) {

        BinaryInsortSort binaryInsortSort=new BinaryInsortSort();
        binaryInsortSort.sort();
    }
}
