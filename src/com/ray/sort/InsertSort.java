package com.ray.sort;

import java.util.Arrays;

/**
 *      直接插入排序
 *      不适合数据量大的排序应用，比如量级小于千
 */
public class InsertSort {

    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int get = arr[i];
            int j = i-1;
            while (j >=0 && arr[j] >get){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=get;
            //排完一遍输出一次结果
            System.out.print("第"+i+"次排序结果：");
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,1,4};
        sort(arr);
    }
}
