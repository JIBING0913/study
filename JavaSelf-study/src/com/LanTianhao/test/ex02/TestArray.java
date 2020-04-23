package com.LanTianhao.test.ex02;

/**
 * 数组
 *
 * @Author: wwb
 * @Date: 2020/4/19 10:52
 */
public class TestArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{2,3,5,7,11,13,17,19};
        int[] array2 = new int[array1.length];
        for (int i=0;i<array1.length;i++){
//            System.out.println(array1[i]);
            array2[i]=array1[i];
            System.out.println(array2[i]);
        }

    }
}
