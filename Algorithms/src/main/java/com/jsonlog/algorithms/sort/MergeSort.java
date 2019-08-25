package com.jsonlog.algorithms.sort;

import java.util.Arrays;

/**
 * @author jsonlog
 * @date 2019-08-24
 */
public class MergeSort {
static int[] mergesort(int A[], int temp[], int left, int right) {
  int mid = (left+right)/2;
  if (left == right) return A;        // List of one element
  mergesort(A, temp, left, mid);
  mergesort(A, temp, mid+1, right);

  int i1 = left; int i2 = mid + 1;
  // Copy subarray to temp
  for (int i=left; i<=right; i++) temp[i] = A[i];
  // Do the merge operation back to A
  for (int curr=left; curr<=right; curr++) {
    if (i1 == mid+1)      // Left sublist exhausted
      A[curr] = temp[i2++];
    else if (i2 > right)  // Right sublist exhausted
      A[curr] = temp[i1++];
    else if (temp[i1]<temp[i2])
      A[curr] = temp[i1++];
    else A[curr] = temp[i2++];
  }
  return A;
}
    static public int[] sort(int[] sourceArray){
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        return mergesort(sourceArray,arr,0,arr.length -1);
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
