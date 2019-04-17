package com.xll.proxy.test;

import com.xll.proxy.factory.WomanFactoryImpl;
import com.xll.proxy.dynamicProxy.BusinessCompany;
import com.xll.proxy.factory.WomanFactory;
import com.xll.proxy.factory.ManFactoryImlp;
import com.xll.proxy.staticProxy.Businessman;
import com.xll.proxy.factory.ManFactory;

/**
 * @author xielulin
 * @create 2019-01-10 11:29
 * @desc 测试代理
 **/
public class Test {

    public static void main(String[] args) {
        testDynamicProxy();
        testStaticProxy();
    }

    private static void testDynamicProxy() {
        System.out.println("***********动态代理开始***************");
        ManFactory manFactory = new ManFactoryImlp();
        WomanFactory womanFactory = new WomanFactoryImpl();
        BusinessCompany company = new BusinessCompany();
        company.setFactory(manFactory);
        ManFactory f1 = (ManFactory) company.getProxyInstance();
        f1.saleTools(30);
        f1.buyTools(50);
        company.setFactory(womanFactory);
        WomanFactory f2 = (WomanFactory) company.getProxyInstance();
        f2.saleTools(100);
        System.out.println("***********动态代理结束***************");

    }

    private static void testStaticProxy() {
        System.out.println("***********静态代理开始***************");
        ManFactory factory = new ManFactoryImlp();
        Businessman businessman = new Businessman(factory);
        businessman.saleTools(20);
        System.out.println("***********静态代理结束***************");
    }


}
