package com.sk.factory;

import com.sk.ICourse;

public class SimplefactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse s = courseFactory.createCourse("java");
        s.record();
    }
}
