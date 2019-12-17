package com.qyd.learn.show.jdk8.defaultmethod;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/21 14:21
 * @Description:
 */
public class DefaultMethodTest {
    public static void main(String[] args) {
        Formula formula=new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };
        System.out.println(formula.calculate(100));
    }
}
