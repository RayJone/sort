package com.ray.sort;

import java.util.Arrays;

/**
 * 归并排序
 *
 */
public class MergeSort {

    //合并两个排好序的数组
    public static void merge(int[] arr,int left,int mid,int right){
        int len = right - left + 1;
        int[] temp = new  int[len];
        int index = 0;
        int i = left;
        int j = mid +1;
        while(i <= mid && j <=right){
            temp[index++] = arr[i] < arr[j] ? arr[i++]:arr[j++];
        }
        while(i <= mid){
            temp[index++] = arr[i++];
        }
        while(j <= right){
            temp[index++] = arr[j++];
        }
        //将排好序的临时数组 赋值给原来的数组
        for (int k = 0; k < len; k++) {
            arr[left++] = temp[k];
        }
    }

    private static int r = 1;
    //递归实现归并排序
    public static void mergeSortRecursion(int[] arr,int left,int right){
        if(left == right){
            return ;
        }
        int mid =  (left + right)/2;
        mergeSortRecursion(arr,left,mid);
        mergeSortRecursion(arr,mid+1,right); //left是mid的话栈溢出
        merge(arr,left,mid,right);

        //排完一遍输出一次结果
        System.out.print("第"+(r++)+"次排序结果：");
        System.out.println(Arrays.toString(arr));
    }
    //非递归、迭代实现,自底向上
    public static void mergeIteration(int[] arr){
        int left,mid,right;
        for (int i = 1; i < arr.length; i*=2) {
            left=0;
            while (left + i < arr.length){
                mid = left + i -1;
                right = (mid+i) < arr.length ? mid+i : arr.length  -1;
                merge(arr,left,mid,right);
                left = right + 1;
            }
            //排完一遍输出一次结果
            System.out.print("第"+(r++)+"次排序结果：");
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,1,4};
//        mergeSortRecursion(arr,0,arr.length-1);
        mergeIteration(arr);

    }
}
