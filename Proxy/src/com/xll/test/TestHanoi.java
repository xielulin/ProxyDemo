package com.xll.test;

/**
 * @author xielulin
 * @create 2019-05-08 10:13
 * @desc 测试黑内塔问题（递归算法）
 **/
public class TestHanoi {


    public static void main(String[] args) {
        int i = 3;
        char a = 'A', b = 'B', c = 'C';
        hanio(i, a, b, c);
    }

    public static void hanio(int n, char a, char b, char c) {
        if (n == 1)
            System.out.println("移动" + n + "号 从盘子" + a + "--> 盘子" + c);
        else {
            hanio(n - 1, a, c, b);//把上面n-1个盘子从a借助b搬到c
            System.out.println("移动" + n + "号 从盘子" + a + "--> 盘子" + c);//紧接着直接把n搬动c
            hanio(n - 1, b, a, c);//再把b上的n-1个盘子借助a搬到c
        }
    }
}