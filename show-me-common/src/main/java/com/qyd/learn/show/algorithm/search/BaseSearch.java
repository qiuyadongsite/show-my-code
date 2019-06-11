package com.qyd.learn.show.algorithm.search;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/11 09:33
 * @Description:
 */
public abstract class BaseSearch {
    private int a[];

    public BaseSearch(){
        this.a=new int[]{12,2,45,34,7,89,65,55,24,111,22,33};
    }

    public void search(int[] a, int value){
        validate(a);
        int index=doSearch(a,value);
        printStr(index);
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    protected abstract int doSearch(int[] a, int value);

    protected  void validate(int[] a){
        if(a==null||a.length<=1){
            return;
        }
    };


    protected void printStr(int index){
        if(index==-1){
            System.out.print("没找到！");
        }else{
            System.out.println("找到元素下标："+index);
        }


    };


}
