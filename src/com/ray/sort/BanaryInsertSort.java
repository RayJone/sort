package com.ray.sort;

import java.util.Arrays;

/**
 * 二分插入排序
 *     查找比较花费的代价比交换大时，适合用二分法
 */
public class BanaryInsertSort {

    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int left = 0;
            int right = i - 1;
            int get = arr[i];

            //查找插入的位置
            while(left <= right){
                int mid = (left + right) / 2;
                if(arr[mid] > get){
                    right = mid -1;
                }else{
                    left = mid + 1;
                }
            }
            for (int j = i-1; j >= left ; j--) {
                arr[j+1] = arr[j];
            }
            arr[left] = get;

            //排完一遍输出一次结果
            System.out.print("第"+(i)+"次排序结果：");
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,1,4};
        sort(arr);
    }
}
