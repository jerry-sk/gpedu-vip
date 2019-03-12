package com.sk.prototype.simple;

import java.io.*;
import java.util.List;

/***
 * Cloneable JDK 如果需要克隆需要实现改接口，否则 抛出 CloneNotSupportedException
 */
public class ConcreatePrototype implements  Cloneable,Serializable{
        public String name;
        public String age;
        public List hobbies;


    protected  Object clone() throws CloneNotSupportedException{
        //return super.clone();
        Object obj = null;
        try {
            obj = deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }


    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(bout);
        os.writeObject(this);
        os.close();

        ByteArrayInputStream bin =  new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream osin = new ObjectInputStream(bin);
        Object obj = osin.readObject();
        osin.close();
        bout.close();
        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    /***
     * 序列化和反序列化在操作 readObject 时如果实现了readResolve 会调用该方法来处理数据，目的是防止在单列时通过序列化的方式来破坏单列
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return this;
    }
}
