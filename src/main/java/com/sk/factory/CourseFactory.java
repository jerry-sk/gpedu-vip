package com.sk.factory;

import com.sk.ICourse;
import com.sk.JavaCourse;

/**
 * 扩展产品需要修改工厂代码，
 * 违背开闭原则
 * 违背单一职责原则
 */
public class CourseFactory  {
        public ICourse createCourse(String Course){
            if ("java".equals(Course)){

                ICourse javaCourse = new JavaCourse();
                return  javaCourse;
            }
            return null;
        }
}
