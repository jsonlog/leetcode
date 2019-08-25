package com.jsonlog.algorithms.sort;

import java.util.Arrays;

/**
 * @author jsonlog
 * @date 2019-08-24
 */
public class BubbleSort {
    static public int[] sort(int[] sourceArray){
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 0; i < arr.length - 1; i++) {//n-1
            int flag = i;//true
            for (int j = i+1; j < arr.length; j++){
                if (arr[arr.length + i -j] < arr[arr.length + i -j -1]) {//左移,交换排序
                    int tmp = arr[arr.length + i -j];
                    arr[arr.length + i -j] = arr[arr.length + i -j -1];
                    arr[arr.length + i -j -1] = tmp;
                    flag = j;
                }
            }
            if(flag == i) break;
        }
        return arr;
    }

    static public int[] sort2(int[] sourceArray){
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 0; i < arr.length - 1; i++) {//n-1
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;

            for (int j = 0; j < arr.length - 1 - i; j++) {//n-1 -> 0
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }
        return arr;
    }
}
