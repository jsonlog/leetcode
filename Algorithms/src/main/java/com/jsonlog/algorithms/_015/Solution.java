package com.jsonlog.algorithms._015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList(){{}};
        List<Integer> list = new ArrayList(){} ;
        int target = 0;
        Arrays.sort(nums);
        int sum;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
//                if(nums[j] == nums[j-1]) {j++;continue;}
//                if(k != nums.length - 1 && nums[k] == nums[k+1]) {k--;continue;}
                sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
//                    System.out.println(i+"*"+nums[i]+"*"+j+"*"+nums[j]+"*"+k+"*"+nums[k]);
                    list = Arrays.asList(nums[i],nums[j],nums[k]);
                    if(!result.contains(list))
                    result.add(list);
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }
}
