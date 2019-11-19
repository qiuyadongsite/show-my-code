package com.qyd.learn.show.jdk8.methodandConstructorReference;

import com.qyd.learn.show.jdk8.functionalinterface.Converter;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/21 14:48
 * @Description:
 */
public class MethodAndConstructorTest {

    public static void main(String[] args) {
/*
        Converter<String,Integer> converter = Integer::valueOf;

        System.out.println(converter.convert("123").getClass());
*/
/*
Something something=new Something();

Converter<String,String> converter=something::startWith;

        System.out.println(converter.convert("java"));

    */

PersonFactory<Person> personPersonFactory=Person::new;
Person p=personPersonFactory.create("jack","toke");
System.out.println(p);

    }
}
class Something{
    String startWith(String a){
        return String.valueOf(a.charAt(0));
    }
}

class Person{
    String name;
    String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}