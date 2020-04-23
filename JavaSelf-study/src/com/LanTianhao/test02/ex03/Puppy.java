package com.LanTianhao.test02.ex03;

/**
 * 创建对象
 *
 * @Author: wwb
 * @Date: 2020/4/18 09:53
 */
public class Puppy {
    public Puppy(String name){
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是：" + name);
    }

    public static void main(String[] args) {
        // 下面的语句将创建一个Puppy对象
        Puppy myPuppy = new Puppy("tommy");
    }
}
