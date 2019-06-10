package com.qyd.learn.show.algorithm.sort;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/10 09:42
 * @Description:冒泡排序算法，稳定，O(N^2)
 */
public class MaoSort extends BaseSort{
    public static void main(String[] args) {

        MaoSort maoSort=new MaoSort();
        maoSort.sort();
    }

    @Override
    protected int[]  doSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for(int j=i;j<a.length-1;j++){
                if (a[j] > a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }
        }
        return a;
    }
}
