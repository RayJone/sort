package com.ray.sort;

import com.ray.utils.SortUtil;

import java.util.Arrays;

/**
 * 快速排序，基于基准Pivot,小于基准的放在前面，大于的放在后边
 * 选取最后一个元素为基准
 *
 */
public class QuickSort {
    //分区，小的放在基准前，大的放在你后边
    public static int partition(int[] arr,int left,int right){
        int pivot = arr[right];
        int tail = left - 1;
        for (int i = left; i < right; i++) {
            if(arr[i] <= pivot){
                SortUtil.swap(arr,i,++tail);
            }
        }
        SortUtil.swap(arr,tail+1,right);
        return tail;
    }

    public static void sort(int[] arr,int left,int right){
        if(left >= right) return;
        int pivot = partition(arr, 0, right);
        sort(arr,0,pivot-1);
        sort(arr,pivot+1,right);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,1,4};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
