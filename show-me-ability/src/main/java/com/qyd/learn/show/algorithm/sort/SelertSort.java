package com.qyd.learn.show.algorithm.sort;

/**
 * 选择排序
 */
public class SelertSort {

    public static void main(String[] args) {

        int[] a={12,23,1,2,42,16,33,121,65,8};
        SelertSort selertSort=new SelertSort();
        selertSort.selertSort(a);
        for (int i :a) {
            System.out.println(" "+i);
        }
    }

    private void selertSort(int[] a) {


        for(int i=0;i<a.length;i++){
            int position=i;

            for(int j=i;j<a.length;j++){

                if(a[j]<=a[position]){
                    position=j;
                }
            }

            int temp=a[position];
            a[position]=a[i];
            a[i]=temp;

        }
    }
}
