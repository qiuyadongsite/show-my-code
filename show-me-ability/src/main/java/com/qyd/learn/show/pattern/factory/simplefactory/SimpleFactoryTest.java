package com.qyd.learn.show.pattern.factory.simplefactory;


import com.qyd.learn.show.pattern.factory.ICourse;
import com.qyd.learn.show.pattern.factory.JavaCourse;

/**
 * 小作坊式的工厂模型
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

//        ICourse course = new JavaCourse();
//        course.record();

//        ICourseFactory factory = new ICourseFactory();
//        ICourse course = factory.create("com.qyd.learn.show.pattern.factory.JavaCourse");
//        course.record();

        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();

    }
}
