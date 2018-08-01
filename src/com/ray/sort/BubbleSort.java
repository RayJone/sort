package com.ray.sort;

import com.ray.utils.SortUtil;

import java.util.Arrays;

/**
 * 冒泡排序:    稳定的
 *          此处我是按照从小到大的顺序排的。数组长度为n
 *      算法：
 *      1.比较相邻的元素，如果前一个比后一个大，就把它们两个调换位置。
 *      2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。 可见第2步需要走n-1遍
 *      3.针对所有的元素重复以上的步骤，除了最后一个。
 *      4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort {

    //交换数组中两个位置的数据
    void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 排序算法
     * @param arr
     */
    public static void sort( int[] arr){
        int n = arr.length;
        //需要比n-1遍
        for (int i = 0; i < n-1; i++) {
            boolean flag = true;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    //顺序错误，交换位置
                    flag = false;
                    SortUtil.swap(arr,j,j+1);
                }
            }
            if (flag == true){  //没有发生交换，说明排序完成，结束循环
                break;
            }
            //排完一遍输出一次结果
            System.out.print("第"+(i+1)+"次排序结果：");
            System.out.println(Arrays.toString(arr));

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,1,4};
        sort(arr);
    }
}
