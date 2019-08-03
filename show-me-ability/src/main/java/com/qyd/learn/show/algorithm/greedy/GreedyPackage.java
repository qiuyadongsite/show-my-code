package com.qyd.learn.show.algorithm.greedy;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/12 16:37
 * @Description:贪心算法：背包问题
 */
public class GreedyPackage {

    /**
     * 有一组物品：
     *         kg     万
     * 金子：10     10
     * 银子：30     4
     * 钻石：1      50
     * 铜版：20     20
     * 特铁：50     20
     * 稀土：15     10
     * @param args
     */
    public static void main(String[] args) {
        int[] weight={10,30,1,20,50,15};
        int[] values={10,4,50,20,20,10};
        int back=70;

        GreedyPackage greedyPackage=new GreedyPackage();
        greedyPackage.inputV(weight,values,back);



    }

    private void inputV(int[] weight, int[] values, int back) {

        double[] valWeight=new double[weight.length];
        int[] index=new int[weight.length];
        for (int i = 0; i <weight.length ; i++) {
            valWeight[i]=(double) values[i]/weight[i];
            index[i]=i;
        }



        for (int i = 0; i < weight.length; i++) {
            for (int j=i;j<weight.length-1;j++){
                if(valWeight[j]<valWeight[j+1]){
                    double temp=valWeight[j];
                    valWeight[j]=valWeight[j+1];
                    valWeight[j+1]=temp;

                    int indexTe=index[j];
                    index[j]=index[j+1];
                    index[j+1]=indexTe;

                }
            }
        }


        double hasWight=0;
        int[] hasIndex=new int[weight.length];
        for (int i = 0; i <valWeight.length ; i++) {

            if (hasWight+weight[index[i]]<back){

                hasWight+=weight[index[i]];

                System.out.println("将"+index[i]+"物品装入包中：它的重量为："+weight[index[i]]+",装入后重量是："+hasWight);

            }
        }
    }

}
