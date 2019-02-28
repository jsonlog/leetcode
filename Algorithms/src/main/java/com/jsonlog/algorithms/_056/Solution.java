package com.jsonlog.algorithms._056;

import com.jsonlog.algorithms.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        int n = intervals.size();
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        List<Interval> res = new ArrayList<>();
        // Two pointers
        int endIndex = 0, startIndex = 0;
        while (endIndex < n) {
            if (endIndex == n - 1 || starts[endIndex + 1] > ends[endIndex]) {
                res.add(new Interval(starts[startIndex], ends[endIndex]));
                startIndex = endIndex + 1;
            }
            endIndex++;
        }

        return res;
    }
}
