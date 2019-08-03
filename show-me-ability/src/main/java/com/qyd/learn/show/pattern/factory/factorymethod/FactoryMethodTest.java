package com.qyd.learn.show.pattern.factory.factorymethod;


import com.qyd.learn.show.pattern.factory.ICourse;

/**
 * Created by qiuyd.
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();

    }

}
