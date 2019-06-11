package com.qyd.learn.show.algorithm.recur;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/11 10:30
 * @Description:泊松分酒
 */
public class ShareWine {
    private static int b1=12;//a杯子的容量
    private static int b2=8;//b杯子的容量
    private static int b3=5;//c杯子的容量
    private static int x=6;//需要倒出的酒量

    public static void main(String[] args) {
        shareWine(12,0,0);//初始的容量
    }
//既然是穷举法，就是一个范围得出结论就行
 //约定一个规则 a-->b--->c--a
    private static void shareWine(int bb1, int bb2, int bb3) {

        System.out.println("A："+bb1+",B:"+bb2+",C:"+bb3);
        if(bb2==x||bb1==x||bb3==x){
            System.out.println("find the wind");
            return;
        }
        //开始约定规则
        if(bb2!=0&&bb3!=b3){
            if(bb2+bb3<=b3){
                //倒不满
                shareWine(bb1, 0, bb2+bb3);
            }else{
                shareWine(bb1, bb2-(b3-bb3), b3);
            }
        }else if(bb3==b3){
            //瓶子3满了，往瓶子1倒
            if(bb3+bb1<=b1){
                //说明倒完后瓶子1没满
                shareWine(bb1+bb3, bb2, 0);
            }else{
                shareWine(b1, bb2, bb3-(b1-bb1));
            }
        }else if(bb2 == 0){
            //从瓶子1往瓶子2里倒酒
            if(bb1>=b2){
                shareWine(bb1-b2, b2, bb3);
            }else{
                shareWine(0, bb1, bb3);
            }
        }



    }


}
