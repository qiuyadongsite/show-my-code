package com.qyd.learn.show.algorithm.sort;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/10 14:58
 * @Description:
 */
public class QuickSwap extends BaseSort {
    @Override
    protected int[] doSort(int[] a) {

        quickSort(a,0,a.length-1);


        return a;
    }

    private void quickSort(int[] a, int start, int end) {

        if(start>=end){
            return;
        }

        int baseV=partion(a,start,end);
        
        quickSort(a,start,baseV);

        quickSort(a, baseV+1,end);


    }

    private int partion(int[] a, int start, int end) {
        //基准元素
        int left=start;
        int right=end;
        int temp=a[start];
        while (end>start){
            while (a[end]>temp&&end>0){
                end--;
            }
            //此处找到小于基准值的数
            while (a[start]<=temp&&start<a.length-1){
                start++;
            }
            //此处找到大于基准值的数
            if(start!=end&&end>start){
                int k=a[start];
                a[start]=a[end];
                a[end]=k;
                start++;
            }
        }
        //start左边的左移一位，右边的left=0 start=3
        if(end!=left){
            temp=a[end];
            a[end]=a[left];
            a[left]=temp;
        }
        return end;

    }

    public static void main(String[] args) {
        QuickSwap quickSwap=new QuickSwap();
        quickSwap.sort();
    }
}
