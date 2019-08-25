package com.jsonlog.algorithms.sort;

import java.util.Arrays;

/**
 * @author jsonlog
 * @date 2019-08-24
 */
public class QuickSort {
    static public int[] sort(int[] sourceArray){
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        return quickSort(arr, 0, arr.length - 1);
    }

    static private int[] quickSort(int[] arr, int l/*left*/, int r/*right*/) {
        if (l < r) {
//1            int partitionIndex = partition(arr, left, right);
/*2

            //Swap(array[l], array[(l + r) / 2]); //将中间的这个数和第一个数交换 有的书上是以中间的数作为基准数的，要实现这个方便非常方便，直接将中间的数和第一个数进行交换就可以了。
            int i = l, j = r, x = array[l];
            while (i < j)
            {
                while(i < j && array[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if(i < j)
                    array[i++] = array[j];

                while(i < j && array[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if(i < j)
                    array[j--] = array[i];
            }
 */
            int i = l, j = r, x = arr[l];
            for(;i < j;j--) {
                if (arr[j] < x) {
                    arr[i] = arr[j];
                    for(i++;i < j;i++){
                        if( arr[i] >= x ){
                            arr[j] = arr[i];
                            break;
                        }
                    }
                }
            }
            arr[i] = x;
            quickSort(arr, l, i - 1);
            quickSort(arr, i + 1, r);
        }
        return arr;
    }

    static private int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    static private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}