package com.jsonlog.algorithms.sort;

import java.util.Arrays;

/**
 * @author jsonlog
 * @date 2019-08-24
 */
public class SelectionSort {
    static public int[] sort(int[] sourceArray){
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 总共要经过 N-1 轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            int flagmin = i;

            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[flagmin]) {
                    //冒泡排序改善 记录目前能找到的最小值元素的下标
                    flagmin = j;
                }
            }

            // 将找到的最小值和i位置所在的值进行交换
            if (i != flagmin) {
                int tmp = arr[i];
                arr[i] = arr[flagmin];
                arr[flagmin] = tmp;
            }

        }
        return arr;
    }
}
