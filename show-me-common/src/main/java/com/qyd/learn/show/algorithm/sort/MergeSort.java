package com.qyd.learn.show.algorithm.sort;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/10 17:22
 * @Description:归并排序
 */
public class MergeSort extends BaseSort{
    @Override
    protected int[] doSort(int[] a) {

        mergeSort(a,0,a.length-1);
        return a;
    }

    private void mergeSort(int[] a, int start, int end) {

        if(start==end){
            return;
        }
        int half=(start+end)/2;
        mergeSort(a,start,half);
        mergeSort(a,half+1,end);

        merge(a,start,half,end);

    }
    //{12},{45},{34,223} 0 ,1,2,3
    private void merge(int[] a, int start, int half, int end) {

        int size=end-start+1;
        int left=start;
        int right=half+1;
        int[] tem=new int[size];
        int thirdIndex=0;
        while (left<=half&&right<=end){
            if(a[left]<=a[right]){
                tem[thirdIndex++]=a[left++];

            }else{
                tem[thirdIndex++]=a[right++];

            }
        }

            while (left<=half){
                tem[thirdIndex++]=a[left++];
            }


            while (right<=end){
                tem[thirdIndex++]=a[right++];
            }

        for(int i=0;i<size;i++){
            a[i+start]=tem[i];

        }

    }

    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        mergeSort.sort();
    }
}
