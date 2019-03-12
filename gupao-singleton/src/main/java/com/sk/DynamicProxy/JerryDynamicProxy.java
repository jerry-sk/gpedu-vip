package com.sk.DynamicProxy;

import sun.misc.ProxyGenerator;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JerryDynamicProxy implements InvocationHandler, Serializable {
    /**
     * 只有代理类
     */
    private Object target;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.target, args);
        after();
        return null;
    }

    /**
     * 返回的一个代理对象
     **/
    public Object getInstance(Object target) throws Exception {
        this.target = target;
        /**生成代理类**/
        Object obj = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        /****生产代理类的字节码文件**/
        byte[] b = ProxyGenerator.generateProxyClass("proxy",target.getClass().getInterfaces());
        File file = new File("D://proxy1.class");
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(b);
        outputStream.flush();;
        outputStream.close();

        return obj;

    }

    public void before() {
        System.out.println("工作找被代理");
    }

    public void after() {
        System.out.println("工作已找到看是您否合适");
    }
}
