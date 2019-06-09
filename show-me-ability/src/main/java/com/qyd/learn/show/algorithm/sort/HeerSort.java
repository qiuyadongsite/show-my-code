package com.qyd.learn.show.algorithm.sort;

/**
 * 希尔排序
 */
public class HeerSort {
    public static void main(String[] args) {

        int[] a={12,23,1,2,42,16,33,121,65,8};
        HeerSort heerSort=new HeerSort();

        int d=a.length/2;
        int temp=0;
        while (true){

            for(int i=0;i<d;i++){
                for(int j=i;j+d<a.length;j=j+d){
                    if(a[j]>a[j+d]){
                      temp=a[j];
                      a[j]=a[j+d];
                      a[j+d]=temp;
                    }
                }
            }

            if(d==1){
                break;
            }
          d--;
        }


        for(int num:a){

            System.out.println(" "+num);

        }
    }



}
