package com.qyd.learn.show.algorithm.sort;

/**
 * 堆排序，也是选择排序的一种
 */
public class HeepSort {

    public static void main(String[] args) {
        int[] a={12,23,1,2,42,16,33,121,65,8};
        HeepSort heepSort=new HeepSort();
        heepSort.selectSort(a);
        for (int num:a
             ) {
            System.out.println(" "+num);

        }
    }

    /**
     *
     *
     *
     *
     * @param a
     */
    private void selectSort(int[] a) {

        if(a==null||a.length<=1){
            return;
        }

        buildMaxHeep(a);

        for (int i = a.length - 1; i >= 1; i--) {
            //最大的在0位置，那么开始沉降，这样每交换一次最大的值就丢到最后了
            exchange(a, 0, i);
            //继续获取0位置最大值
            maxHeep(a,i, 0);
        }

    }

    private void buildMaxHeep(int[] a) {

        int half=a.length/2;

        for(int i=half;i>=0;i--){
            maxHeep(a,a.length,i);
        }
    }

    private void maxHeep(int[] a,int length, int i) {

        int left=2*i+1;
        int right=2*i+2;
        int largest=i;
        if(left<length&&a[i]<a[left]){
            largest=left;
        }

        if (right<length&&a[largest]<a[right]) {

           largest=right;
        }
        if(i!=largest){
            exchange(a,i,largest);
            maxHeep(a,length,largest);
        }
    }

    private void exchange(int[] a, int i, int largest) {
      int temp=a[i];
      a[i]=a[largest];
      a[largest]=temp;
    }

}
