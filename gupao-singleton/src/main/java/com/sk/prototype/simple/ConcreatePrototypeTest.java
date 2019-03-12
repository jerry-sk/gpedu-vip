package com.sk.prototype.simple;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class ConcreatePrototypeTest {
        public static void main(String[] args) {
                ConcreatePrototype concreatePrototype = new ConcreatePrototype();
                concreatePrototype.setName("sk");
                concreatePrototype.setAge("11");
                concreatePrototype.setHobbies(new ArrayList());
                try {
                        ConcreatePrototype b = (ConcreatePrototype) concreatePrototype.clone();
                        /*
                        System.out.println("原"+concreatePrototype.getHobbies());
                        System.out.println("目"+b.getHobbies());
                        System.out.println("浅clone:"+(concreatePrototype.getHobbies() == b.getHobbies()));
                         */

                        System.out.println("原目"+(concreatePrototype==b));


                        System.out.println("原"+concreatePrototype.getHobbies());
                        System.out.println("目"+b.getHobbies());
                        System.out.println("deep clone:"+(concreatePrototype.getHobbies() == b.getHobbies()));



                        //
                        ConcreatePrototypeTest.class.newInstance();
                        Constructor[] s = ConcreatePrototypeTest.class.getConstructors();
                        Constructor constructor = ConcreatePrototypeTest.class.getConstructor();
                        constructor.newInstance();

                } catch (Exception e) {
                        e.printStackTrace();
                }


        }

}
