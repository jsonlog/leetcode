package com.jsonlog.algorithms._077;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        backtracking(result, new ArrayList(), nums, k , 0);
        
        return result;
    }

    void backtracking(List<List<Integer>> result, List<Integer> tempList, int[] nums, int k, int start) {
        if (tempList.size() == k) {
            result.add(new ArrayList(tempList));
        } else if (tempList.size() < k) {
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                backtracking(result, tempList, nums, k, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
//DP    
    public List<List<Integer>> combine2(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (k > n || k < 0) {
            return result;
        }
        if (k == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }
        result = combine(n - 1, k - 1);
        for (List<Integer> list : result) {
            list.add(n);
        }//C(n,k)=C(n-1,k-1)(with n)+C(n-1,k)(without n)
        result.addAll(combine(n - 1, k));
        return result;
    }
}