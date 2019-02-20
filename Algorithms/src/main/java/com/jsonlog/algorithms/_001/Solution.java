package com.jsonlog.algorithms._001;

import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> numSet = new HashSet<>();
        //numSet.addAll(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        for(int i:nums){
            numSet.add(i);
        }

        for(int i = 0; i < nums.length; i++) {
            if (numSet.contains(target - nums[i])) {
                for(int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }
        }

        return new int[]{};
    }
}
