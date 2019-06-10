package com.qyd.learn.show.algorithm.sort;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/10 09:51
 * @Description:使用模板方法
 */
public abstract class BaseSort {
    private int a[];

    public BaseSort(){
        this.a=new int[]{12,2,45,34,7,89,65,55,24,111,22,33};
    }


    public void sort(){
        validate(a);
        int[] sortArray=doSort(a);
        printArray(sortArray);
    }

    protected  void validate(int[] a){
        if(a==null||a.length<=1){
            return;
        }
    };

    protected void printArray(int[] a){
        for (int i:a) {
            System.out.print(" "+i);
        }
    };

    protected abstract int[] doSort(int[] a);
}
