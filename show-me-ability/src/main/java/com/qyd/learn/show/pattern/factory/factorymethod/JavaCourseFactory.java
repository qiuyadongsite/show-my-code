package com.qyd.learn.show.pattern.factory.factorymethod;


import com.qyd.learn.show.pattern.factory.ICourse;
import com.qyd.learn.show.pattern.factory.JavaCourse;

/**
 * Created by qiuyd.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
