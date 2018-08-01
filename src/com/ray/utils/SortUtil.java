package com.ray.utils;

public class SortUtil {

    /**
     * 交换Int数组中的两个数值
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
