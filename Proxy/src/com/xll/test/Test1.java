package com.xll.test;

/**
 * @author xielulin
 * @create 2019-04-23 09:20
 * @desc
 **/
public class Test1 {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    /**
     * @description 获取买包子的数量
     * @author xielulin
     * @date 2019/4/23
     * @param isSellWatermelon 是否有卖瓜的
     * @return int
     */
    public int getNum(boolean isSellWatermelon){
        int num = 10;
        if(isSellWatermelon){
            num = 1 ;
        }
        return num;
    }

    public static void main(String[] args) {
        Test1 man = new Test1();
        man.setName("张三");
        int num = man.getNum(true);
        System.out.println(man.getName()+"需要买"+num + "个包子");
    }
}
