package com.qyd.learn.show.jdk8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/21 14:25
 * @Description:
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("tom","jack","mike");
      /*  testOldMethed(names);*/
        testNewMethod(names);
    }

    private static void testNewMethod(List<String> names) {

        Collections.sort(names,(String a,String b)->{
            return a.compareTo(b);
        });

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        /*Collections.sort(names,(String a,String b)->a.compareTo(b));*/

        names.sort((String a,String b)->a.compareTo(b));

        System.out.println(Arrays.toString(names.toArray()));
    }

    static void testOldMethed(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(names.toArray()));
    }
}
