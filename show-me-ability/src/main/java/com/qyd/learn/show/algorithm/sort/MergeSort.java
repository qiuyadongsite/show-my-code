package com.qyd.learn.show.algorithm.sort;

/**
 * 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] a={12,23,1,2,42,16,33,121,65,8};
        MergeSort mergeSort=new MergeSort();
        mergeSort.sort(a,0,a.length-1);
        for (int num:a
             ) {
            System.out.println(" "+num);
        }
    }

    private void sort(int[] a,int start,int end) {
      if(start<end){

          int half=(start+end)/2;
          sort(a,start,half);
          sort(a,half+1,end);

          merge(a,start,half,end);

      }





     }

    private void merge(int[] a, int start, int half, int end) {

        int[] tmpArray=new int[a.length];
        int rightStart = half+1;
        int tmp = start;
        int third = start;
        //比较两个小数组相应下标位置的数组大小，小的先放进新数组
        while(start<=half&&rightStart<=end){
            if(a[start]<=a[rightStart]){
                tmpArray[third++] = a [start++];
            }else{
                tmpArray[third++] = a[rightStart++];
            }
        }
        //如果左边还有数据需要拷贝，把左边数组剩下的拷贝到新数组
        while(start<=half){
            tmpArray[third++] = a[start++];
        }
        //如果右边还有数据......
        while(rightStart<=end){
            tmpArray[third++] = a[rightStart++];
        }
        while(tmp<=end){
            a[tmp] = tmpArray[tmp++];
        }
    }


}
