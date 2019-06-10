package com.qyd.learn.show.algorithm.sort;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/10 10:50
 * @Description:希尔排序
 */
public class HeerSort extends BaseSort {
    @Override
    protected int[] doSort(int[] a) {

        int d=a.length/2;

        while (d>0){
                for(int j=0;j+d<a.length;j++){
                    if(a[j]>a[j+d]){
                        int temp=a[j];
                        a[j]=a[j+d];
                        a[j+d]=temp;
                    }
                }
            d--;
        }

        return a;
    }

    public static void main(String[] args) {
        HeerSort sort=new HeerSort();
        sort.sort();
    }
}
