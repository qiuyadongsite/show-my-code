package com.qyd.learn.show.jdk8.functionalinterface;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/21 14:42
 * @Description:
 */
public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        Converter<String,Integer> converter = (from)->Integer.valueOf(from);

        Integer to= converter.convert("123");
        System.out.println(to.getClass());

        //

    }

}
