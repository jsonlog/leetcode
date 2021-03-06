package com.jsonlog.algorithms.sort;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort{
    static public int[] sort(int sourceArray[]) { // Shellsort
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        int n = sourceArray.length;
        for (int i=n/2; i>=1; i/=2)  // For each incr
            for (int j=0; j<i; j++)   // Sort sublists
                InsertSort.insertsort2(arr, n, j, i);
        return arr;
    }

    static public int[] sort2(int[] sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        int gap = 1;
        while (gap < arr.length) {
            gap = gap * 3 + 1;
        }

        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int tmp = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = tmp;
            }
            gap = (int) Math.floor(gap / 3);
        }

        return arr;
    }
}
