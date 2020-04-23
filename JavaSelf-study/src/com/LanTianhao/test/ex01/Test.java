package com.LanTianhao.test.ex01;

/**
 * 冒泡排序
 * @Author: wwb
 * @Date: 2020/4/18 20:53
 */
public class Test {
    public static void main(String[] args) {
       int[] arr = new int[]{4,7,3,1};
       int temp=0;
       for (int i=0;i<arr.length-1;i++){
           for (int j=0;j<arr.length-1-i;j++){
               if (arr[j]<arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
       for (int i = 0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
