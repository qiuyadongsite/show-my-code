package com.qyd.learn.show.algorithm.sort;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/10 14:02
 * @Description:选择排序
 */
public class SelectSort extends BaseSort {
    @Override
    protected int[] doSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int index=i;
            int min=a[i];
            for(int j=i;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    index=j;
                }
            }

            if(index!=i){
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
            }

        }
        return a;
    }

    public static void main(String[] args) {
        SelectSort sort=new SelectSort();
        sort.sort();
    }
}
