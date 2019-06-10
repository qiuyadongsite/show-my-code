package com.qyd.learn.show.algorithm.sort;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/10 09:51
 * @Description:直接插入排序，思想是往一个有序的队列中直接插入
 */
public class InsertSort extends BaseSort {
    @Override
    protected int[]  doSort(int[] a) {
        int[] retArray=new int[a.length];
        retArray[0]=a[0];
        for (int i = 1; i < a.length; i++) {
            insertArray(retArray,i,a[i]);
        }

          return retArray;
    }

    private void insertArray(int[] retArray,int index, int data) {
        if(data>=retArray[index-1]){
            retArray[index]=data;
        }else{
            int temp=index-1;
            while (retArray[temp]>data){
                retArray[temp+1]=retArray[temp];
                index=temp;
                temp--;
                if(temp<0) {
                    break;
                }
            }
            retArray[index]=data;
        }
    }

    public static void main(String[] args) {
        InsertSort insertSort=new InsertSort();
        insertSort.sort();
    }
}
