package com.qyd.learn.show.algorithm.sort;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/10 14:21
 * @Description:
 */
public class HeepSort extends BaseSort {
    @Override
    protected int[] doSort(int[] a) {

        //大堆
        //先看看规律  叶子节点是父节点的2*n+1
        //那么从half开始向上建树
        for(int i=a.length;i>1;i--){
            maxHeep(a,i);
            //构建好大堆，跟最后一个数字
            swap(a,0,i-1);
        }
        return a;
    }

    private void swap(int[] a, int i, int i1) {
        int temp=a[i];
        a[i]=a[i1];
        a[i1]=temp;
    }

    private void maxHeep(int[] a, int length) {
        int half=length/2;
        //建设大堆
        while (half>=0){
            int left=2*half+1;
            int right=2*half+2;
            int largest=half;
            if(left<length&&a[left]>a[half]){
                largest=left;
            }
            if(right<length&&a[right]>a[largest]){
                largest=right;
            }

            if(largest!=half){
                int temp=a[half];
                a[half]=a[largest];
                a[largest]=temp;
            }
            half--;
        }
    }

    public static void main(String[] args) {
        HeepSort heepSort=new HeepSort();
        heepSort.sort();
    }
}
