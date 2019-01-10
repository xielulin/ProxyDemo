package com.xll.dynamic;

import com.xll.stat.ManFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xielulin
 * @create 2019-01-10 11:24
 * @desc 代理公司
 **/
public class BusinessCompany implements InvocationHandler {
    private Object factory;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doSomethingBefore();
        Object object = method.invoke(factory,args);
        doSomethingAfter();
        return object;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces(),this);
    }

    public Object getFactory() {
        return factory;
    }

    public void setFactory(Object factory) {
        this.factory = factory;
    }

    private void doSomethingBefore() {
        System.out.println("前置增强");
    }

    private void doSomethingAfter() {
        System.out.println("后置增强");
    }


}
