package com.ray.sort;

import com.ray.utils.SortUtil;

import java.util.Arrays;

/**
 *      选择排序        不稳定
 *
 *      初始时在序列中找到最小（大）元素，放到序列的起始位置作为已排序序列；
 *      然后，再从剩余未排序元素中继续寻找最小（大）元素，放到已排序序列的末尾。
 *      以此类推，直到所有元素均排序完毕。
 */
public class SelectSort {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){   //如果比当前值小，则交换
                    SortUtil.swap(arr,j,min);
                }
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
