package com.qyd.learn.show.concurrency.thread;

import com.qyd.learn.show.pattern.proxy.Person;

import java.time.Clock;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/19 11:05
 * @Description:
 */
public class ThreadStatusDemo {
    private String firstName;

    public ThreadStatusDemo() {
    }

    public ThreadStatusDemo(String firstName) {
        this.firstName = firstName;
    }

    public static void main(String[] args) {
       /* new Thread(()->{
                    try {
                        TimeUnit.MILLISECONDS.sleep(1);
                        Thread.interrupted();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                },"wait_sleep").start();*/

      /*  Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("123");     // "123"

        Supplier<ThreadStatusDemo> personSupplier = ThreadStatusDemo::new;
        ThreadStatusDemo we= personSupplier.get();   // new Person

        Consumer<ThreadStatusDemo> greeter = (p) -> System.out.println("Hello, " + p.firstName);
        greeter.accept(new ThreadStatusDemo("Luke"));

        //of（）：为非null的值创建一个Optional
        Optional<String> optional = Optional.of("bam");
// isPresent（）： 如果值存在返回true，否则返回false
        optional.isPresent();           // true
//get()：如果Optional有值则将其返回，否则抛出NoSuchElementException
        optional.get();                 // "bam"
//orElse（）：如果有值则将其返回，否则返回指定的其它值
        optional.orElse("fallback");    // "bam"
//ifPresent（）：如果Optional实例有值则为其调用consumer，否则不做处理
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"

        List<String> stringList=new ArrayList<>();
        stringList.add("aa");

        Optional<String> reduced =
                stringList
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);

*/
/*
        // 字符串连接，concat = "ABCD"
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
// 求最小值，minValue = -3.0
        double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
// 求和，sumValue = 10, 有起始值
        int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
// 求和，sumValue = 10, 无起始值
        sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
// 过滤，字符串连接，concat = "ace"
        concat = Stream.of("a", "B", "c", "D", "e", "F").
                filter(x -> x.compareTo("Z") > 0).
                reduce("", String::concat);
*/

   /*     int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        //串行排序
        long t0 = System.nanoTime();
        long count = values.stream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
*/
      /*  Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((id, val) -> System.out.println(val));//val0 val1 val2 val3 val4 val5 val6 val7 val8 val9

        map.getOrDefault(42, "not found");  // not found*/
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println(millis);//1552379579043
        Instant instant = clock.instant();
        System.out.println(instant);
        Date legacyDate = Date.from(instant); //2019-03-12T08:46:42.588Z
        System.out.println(legacyDate);//Tue Mar 12 16:32:59 CST 2019

    }
}
