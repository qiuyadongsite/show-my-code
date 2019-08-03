package com.qyd.learn.show.pattern.factory.factorymethod;


import com.qyd.learn.show.pattern.factory.ICourse;
import com.qyd.learn.show.pattern.factory.PythonCourse;

/**

 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
