package com.xll.test;

import com.xll.stat.AaFactory;
import com.xll.stat.Businessman;
import com.xll.stat.ManFactory;

/**
 * @author xielulin
 * @create 2019-01-10 11:29
 * @desc 测试代理
 **/
public class Test {

     public static void main(String[] args){
        ManFactory factory = new AaFactory();
        Businessman businessman = new Businessman(factory);
        businessman.saleTools(20);
    }



}
