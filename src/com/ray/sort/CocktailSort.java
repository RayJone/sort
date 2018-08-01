package com.ray.sort;

import com.ray.utils.SortUtil;

import java.util.Arrays;

/**
 *      鸡尾酒排序，是冒泡排序的改进版，也叫定向冒泡排序
 *      一次排序分为两轮：
 *          前半轮：从左向右，最后一个元素为最大元素
 *          后半轮：从右往左，最前的元素为最小元素
 */
public class CocktailSort {
    public static void sort(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            boolean flag = true;
            //从左向右走，最后最右边的为最大值
            for (int i = left; i < right; i++) {
                if(arr[i] > arr[i+1]){
                    flag = false;
                    SortUtil.swap(arr,i,i+1);
                }
            }
            //排完一遍输出一次结果
            System.out.print("第"+(left+1)+"次-前半轮排序结果：");
            System.out.println(Arrays.toString(arr));

            right--;
            //从右往左比较，最后最左边的为最小值
            for (int i = right; i > left; i--) {
                if(arr[i-1] > arr[i]){
                    flag = false;
                    SortUtil.swap(arr,i-1,i);
                }
            }
            //没有发生交换，说明排序完成，结束循环
            if(flag){
                break;
            }
            //排完一遍输出一次结果
            System.out.print("第"+(left+1)+"次-后半轮排序结果：");
            System.out.println(Arrays.toString(arr));
            left++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,1,4};
        sort(arr);
    }
}
