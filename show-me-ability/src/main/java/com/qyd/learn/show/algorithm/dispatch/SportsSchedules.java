package com.qyd.learn.show.algorithm.dispatch;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/12 17:11
 * @Description:分治算法：找规律先解决小问题，n个球队n-1天比赛完成
 */
public class SportsSchedules {

    public static void main(String[] args) {

        int n=32;
        int[][] schedulesTables=new int[n][n];
        SportsSchedules sportsSchedules=new SportsSchedules();
        sportsSchedules.dispatch(n,schedulesTables);

        int x=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+schedulesTables[i][j]);
                x++;
                if(x%n==0){
                    System.out.println("");
                }

            }
        }
    }

    private void dispatch(int n,int[][] schedulesTables) {

        if (n==1){
            schedulesTables[0][0]=n;
        }else{
            //将一个二维表分一半
            int half=n/2;

            // 1  2
            // 2  1

            //处理左上角
            dispatch(half,schedulesTables);

            //处理右上半部分

            for (int i = 0; i <half; i++) {
                for(int j=half;j<n;j++){
                    schedulesTables[i][j]=schedulesTables[i][j-half]+half;
                }
            }



            //处理左下半部分
            for (int i =half; i <n; i++) {
                for(int j=0;j<half;j++){
                    schedulesTables[i][j]=schedulesTables[i-half][j]+half;
                }
            }

            //处理右下半部分
            for (int i = half; i <n; i++) {
                for(int j=half;j<n;j++){
                    schedulesTables[i][j]=schedulesTables[i-half][j-half];
                }
            }



        }






    }
}
