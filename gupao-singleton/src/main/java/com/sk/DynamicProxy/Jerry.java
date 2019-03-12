package com.sk.DynamicProxy;

import java.io.Serializable;

public class Jerry implements Person, Serializable {
    private  String name = "jerrys";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void findJob(String jobType, String jobAddr) {
        System.out.println("我需要加薪升职，薪资翻倍!!!!!!!!!!");
    }
}
