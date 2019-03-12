package com.sk.factoryMethod;

import com.sk.ICourse;
import com.sk.factory.CourseFactory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse s = javaCourseFactory.createCourse();
        s.record();

        ICourseFactory pythonCourseFactory = new PythonCourseFactory();
        ICourse course = pythonCourseFactory.createCourse();
        course.record();
    }
}
