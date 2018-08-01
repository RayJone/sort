package com.ray.sort;

import com.ray.utils.SortUtil;

import java.util.Arrays;

/**
 * 堆排序
 * 1.先将数组建成一个最大堆，
 * 2.将堆顶元素（最大）与堆尾元素互换位置，
 * 3.堆大小减1，调用heapify重新调整堆
 * 4.直到堆大小为1，重复2,3
 * 不稳定，时间复杂度为O(nlogn)
 *
 */
public class HeapSort {
    /**
     * 建立堆
     * @param arr
     * @return
     */
    public static int buildHeap(int[] arr){
        int heapSize = arr.length;
        for (int i = heapSize/2 - 1; i >= 0; i--) {
            heapify(arr,i,heapSize);
        }
        return heapSize;
    }

    /**
     * 重新调整堆
     * @param arr
     * @param i
     * @param size
     */
    public static void heapify(int[] arr,int i,int size){
        int leftChild = 2*i + 1;
        int rightChile = 2*i + 2;
        int max = i;
        if(leftChild < size && arr[max] < arr[leftChild]){
            max = leftChild;
        }
        if(rightChile < size && arr[max] < arr[rightChile]){
            max = rightChile;
        }
        if(max != i){
            SortUtil.swap(arr,i,max);
            heapify(arr,max,size);
        }
    }

    public static void sort(int[] arr){
        int size = buildHeap(arr);
        while(size > 1){
            SortUtil.swap(arr,0,--size);
            heapify(arr,0,size);

            //排完一遍输出一次结果
            System.out.print("第"+(arr.length-size)+"次排序结果：");
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,1,4};
        sort(arr);
    }
}
