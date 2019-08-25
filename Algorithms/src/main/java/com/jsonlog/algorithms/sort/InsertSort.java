package com.jsonlog.algorithms.sort;

import java.util.Arrays;

/**
 * @author jsonlog
 * @date 2019-08-24
 */
public class InsertSort {
    static public int[] sort(int[] sourceArray){
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 0; i < arr.length - 1; i++) {

            // 记录要插入的数据
            int tmp = arr[i+1];
            int flag = 0;

            for(int j = 0; j < i+1 ; j++){
                if(flag == j && arr[j] <= arr[i+1]) flag++;
                else{
                    arr[i+1+flag-j] = arr[i+flag-j];//flag -> i 右移
                    if(j == i) arr[flag] = tmp;
                }
            }
        }
        return arr;
    }

    static public int[] insertsort(int sourceArray[]) { //from 0 incr 1
        int n = sourceArray.length;
        int[] a = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i=1; i<n; i++)       // insert i'th record
            for (int j=i; (j>0) && (a[j]<a[j-1]); j--)
              Sort.swap(a, j,j-1);
        return a;
    }

    static public int[] insertsort2(int sourceArray[], int n, int from, int incr)
    {
        for (int i= from + incr; i<n; i+=incr)
            for (int j=i; j> from && sourceArray[j]<sourceArray[j-incr]; j-=incr) {
                int tmp = sourceArray[j];
                sourceArray[j] = sourceArray[j-incr];
                sourceArray[j-incr] = tmp;
            }
        return sourceArray;
    }


    static public int[] sort2(int[] sourceArray){
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {

            // 记录要插入的数据
            int tmp = arr[i];

            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }

        }
        return arr;
    }
}
