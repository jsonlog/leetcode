package com.jsonlog.algorithms;

import com.jsonlog.algorithms.sort.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, it's: "); System.out.println(new Date());
//        System.out.println("test");





//        random();
//        array();
//        movebit();
        sort();



//        try {
//            Thread.currentThread().sleep(5 * 1000);
//        } catch(InterruptedException e) {}
    }
    static void sort(){
        // 生成随机数组
        int[] array = randomArray(0, 1000, 100);
        // 使用 Arrays.sort() 排序作为对比
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        //冒泡排序1
//        sout(BubbleSort.sort(array));

        //桶排序
//        BucketSort

        //计数排序
//        CountingSort

        //堆排序
//        HeapSort

        //插入排序3
        System.out.println(sout(InsertSort.insertsort(array)).equals(sout(sortedArray)));

        //归并排序6
//        System.out.println(sout(MergeSort.sort(array)).equals(sout(sortedArray)));

        //快速排序5
//        System.out.println(sout(QuickSort.sort(array)).equals(sout(sortedArray)));

        //基数排序
//        RadixSort

        //选择排序2
//        sout(SelectionSort.sort(array));

        //希尔排序4
//        System.out.println(sout(ShellSort.sort(array)).equals(sout(sortedArray)));

//        sout(array);
    }

    static String sout(int[] array){
        String string = "";
        for(int i : array){
            string += i+" ";
        }
        System.out.println(string);
        return string;
    }

    static void random(){
        for (int i = 0; i < 10; i++) {
            Random rand = new Random(47);//no change
            Random rand2 = new Random(47);//equals to rand
            Random rand3 = new Random();
            System.out.println("j2-j3-j-k-p--");
            int j2 = rand2.nextInt(20);
            System.out.println(j2);
            int j3 = rand3.nextInt(25-6+1)+6;//6->25
            System.out.println(j3);
            int j = rand.nextInt(20);
            int k = rand.nextInt(20);
            int p = rand.nextInt(20);
            System.out.println(j);
//            System.out.println(rand2.nextInt(20));
            System.out.println(k);
            System.out.println(p);
        }
    }
    static void array(){
        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2;
        a2 = a1;
        for(int i = 0; i < a2.length; i++)
            a2[i]++;
        for(int i = 0; i < a1.length; i++)
            System.out.println(
                    "a1[" + i + "] = " + a1[i]);
//        System.out.println(Arrays.deepToString(a1));
    }
    static void movebit(){
        int i = -128 >> 1;
        System.out.println(""+i);
        i = -127 >> 1;
        System.out.println(""+i);
        i = 0 >> 1;
        System.out.println(""+i);
        i = -1 >> 1;
        System.out.println(""+i);
        i = 1 >> 1;
        System.out.println(""+i);
        i = 127 >> 1;
        System.out.println(""+i);

        i = -128 << 1;
        System.out.println(""+i);
        i = -127 << 1;
        System.out.println(""+i);
        i = 0 << 1;
        System.out.println(""+i);
        i = -1 << 1;
        System.out.println(""+i);
        i = 1 << 1;
        System.out.println(""+i);
        i = 127 << 1;
        System.out.println(""+i);
    }
    /**
     * 随机指定范围内N个不重复的数
     * 在初始化的无重复待选数组中随机产生一个数放入结果中，
     * 将待选数组被随机到的数，用待选数组(len-1)下标对应的数替换
     * 然后从len-2里随机产生下一个随机数，如此类推
     *
     * @param max 指定范围最大值
     * @param min 指定范围最小值
     * @param n   随机数个数
     * @return int[] 随机数结果集
     */
    static public int[] randomArray(int min, int max, int n) {
        int len = max - min + 1;

        if (max < min || n > len) {
            return null;
        }

        //初始化给定范围的待选数组
        int[] source = new int[len];
        for (int i = min; i < min + len; i++) {
            source[i - min] = i;
        }

        int[] result = new int[n];
        Random rd = new Random();
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            //待选数组0到(len-2)随机一个下标
            index = Math.abs(rd.nextInt() % len--);
            //将随机到的数放入结果集
            result[i] = source[index];
            //将待选数组中被随机到的数，用待选数组(len-1)下标对应的数替换
            source[index] = source[len];
        }
        return result;
    }
}
