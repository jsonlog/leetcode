package com.jsonlog.algorithms.sort;

/**
 * @author jsonlog
 * @date 2019-08-25
 */
public class Sort {

    static public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
