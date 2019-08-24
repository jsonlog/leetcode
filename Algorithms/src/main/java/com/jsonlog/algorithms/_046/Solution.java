package com.jsonlog.algorithms._046;

import java.util.ArrayList;
import java.util.List;

public class Solution {
//        Permutations : https://leetcode.com/problems/permutations/

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        if (nums.length == 0) {
            return permutations;
        }

        collectPermutations(nums, 0, new ArrayList<Integer>(), permutations);
        return permutations;
    }

    private void collectPermutations(int[] nums, int start, List<Integer> permutation,
                                     List<List<Integer>>  permutations) {

        if (permutation.size() == nums.length) {
            permutations.add(permutation);
            return;
        }

        for (int i = 0; i <= permutation.size(); i++) {
            List<Integer> newPermutation = new ArrayList<>(permutation);
            newPermutation.add(i, nums[start]);
            collectPermutations(nums, start + 1, newPermutation, permutations);
        }
    }
}
/*
 nums = 1,2,3

start = 0, permutation = []
i = 0, newPermutation = [1]
	start = 1, permutation = [1]
	i = 0, newPermutation = [2, 1]
		start = 2, permutation = [2, 1]
		i = 0, newPermutation = [3, 2, 1]
		i = 1, newPermutation = [2, 3, 1]
		i = 2, newPermutation = [2, 1, 3]
	i = 1, newPermutation = [1, 2]
		start = 2, permutation = [1, 2]
		i = 0, newPermutation = [3, 1, 2]
		i = 1, newPermutation = [1, 3, 2]
		i = 2, newPermutation = [1, 2, 3]
  */