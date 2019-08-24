package com.jsonlog.algorithms.sort;

import java.util.Arrays;

/**
 * @author jsonlog
 * @date 2019-08-24
 */
public class MergeSort {
    static public int[] sort(int[] sourceArray){
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        if (arr.length < 2) {
            return arr;
        }
        int middle = (int) Math.floor(arr.length / 2);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort(left), sort(right));
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