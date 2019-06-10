package com.qyd.learn.show.algorithm.sort;

import java.util.ArrayList;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/10 18:17
 * @Description:基数排序  {12,2,45,34,7,89,65,55,24,111,22,33}
 */
public class BasicSort extends BaseSort{
    @Override
    protected int[] doSort(int[] a) {

        //先获取最大的轮询次数，也就是数字中最大的数的位数
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        int size=0;
        while (max>0){
            max=max/10;
            size++;
        }



        for(int i=0;i<size;i++){
            ArrayList<ArrayList<Integer>> list=new ArrayList<>(10);
            for (int k = 0; k <10 ; k++) {
                list.add(new ArrayList());
            }
            for(int j=0;j<a.length;j++){
                int x = a[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i);
                list.get(x).add(a[j]);
            }
            int index=0;
            for(ArrayList arrayList:list){
                for (int x=0;x<arrayList.size();x++){
                    a[index++]=(int)arrayList.get(x);
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        BasicSort basicSort=new BasicSort();
        basicSort.sort();
    }
}
