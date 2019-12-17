package com.qyd.learn.show.algorithm.sort;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/10 14:02
 * @Description:选择排序
 */
public class SelectSort extends BaseSort {
    @Override
    public int[] doSort(int[] a) {
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        SelectSort sort=new SelectSort();
        sort.sort();
    }
}
