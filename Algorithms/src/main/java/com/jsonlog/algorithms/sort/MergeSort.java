package com.jsonlog.algorithms.sort;

import java.util.Arrays;

/**
 * @author jsonlog
 * @date 2019-08-24
 */
public class MergeSort {
    static public int[] sort(int[] sourceArray){
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        return mergesort(arr,0,arr.length -1);
    }
    static int[] mergesort(int arr[], int left, int right) {
        if (left == right) return arr;        // List of one element

        int i1 = left; //Left sublist start
        int mid = (left+right)/2;
        int i2 = mid + 1; //Right sublist start
        mergesort(arr, left, mid);
        mergesort(arr, mid+1, right);


        int temp[] = new int[arr.length];
        for (int i=left; i<=right; i++) temp[i] = arr[i];// Copy subarray to temp
        for (int curr=left; curr<=right; curr++) {// Do the merge operation back to A
            if (i1 > mid)      // Left sublist end exhausted
                arr[curr] = temp[i2++];
            else if (i2 > right)  // Right sublist end exhausted
                arr[curr] = temp[i1++];
            else if (temp[i1]<=temp[i2])
                arr[curr] = temp[i1++];
            else
                arr[curr] = temp[i2++];
        }
        return arr;
    }


    static public int[] sort2(int[] sourceArray){
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        if (arr.length < 2) {
            return arr;
        }
        int middle = (int) Math.floor(arr.length / 2);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort2(left), sort2(right));
    }

    static protected int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int l = 0, r = 0, len = 0;
        while (len < left.length + right.length) {
            if (left[l] <= right[r]) {
                result[len++] = left[l++];

                if (l == left.length) {
                    for (int i = r; i < right.length; i++) {
                        result[len++] = right[r++];
                    }
                }
            } else {
                result[len++] = right[r++];

                if (r == right.length) {
                    for (int i = l; i < left.length; i++) {
                        result[len++] = left[l++];
                    }
                }
            }
        }

        return result;
    }

}
