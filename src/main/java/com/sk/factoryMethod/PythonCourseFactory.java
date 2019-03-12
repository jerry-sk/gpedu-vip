package com.sk.factoryMethod;

import com.sk.ICourse;
import com.sk.JavaCourse;
import com.sk.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    public ICourse createCourse(){
        ICourse pythonCourse = new PythonCourse();
        return  pythonCourse;
    }
}
