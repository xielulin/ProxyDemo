package com.xll.test;

import com.xll.dynamic.BbFactory;
import com.xll.dynamic.BusinessCompany;
import com.xll.dynamic.WomanFactory;
import com.xll.stat.AaFactory;
import com.xll.stat.Businessman;
import com.xll.stat.ManFactory;

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
        ManFactory manFactory = new AaFactory();
        WomanFactory womanFactory = new BbFactory();
        BusinessCompany company = new BusinessCompany();
        company.setFactory(manFactory);
        ManFactory f1 = (ManFactory) company.getProxyInstance();
        f1.saleTools(30);
        company.setFactory(womanFactory);
        WomanFactory f2 = (WomanFactory) company.getProxyInstance();
        f2.saleTools(100);
        System.out.println("***********动态代理结束***************");

    }

    private static void testStaticProxy() {
        System.out.println("***********静态代理开始***************");
        ManFactory factory = new AaFactory();
        Businessman businessman = new Businessman(factory);
        businessman.saleTools(20);
        System.out.println("***********静态代理结束***************");
    }


}
