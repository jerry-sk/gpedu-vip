package com.sk.abstractFactory;

import com.sk.ICourse;

//要求所有的子工厂都实现
//一个品牌的抽象（可以创建多个产品）
public interface ICourseFactory {


    public ICourse createCourse();//dddd

    public ICourse createNotes();

    public ICourse createVedio();
}
