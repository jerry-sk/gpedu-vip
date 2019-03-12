package com.sk.factoryMethod;

import com.sk.ICourse;
import com.sk.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    public ICourse createCourse(){
        ICourse javaCourse = new JavaCourse();
        return  javaCourse;
    }
}
