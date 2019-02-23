package com.jsonlog.algorithms._049;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for(String w : strs){
            String key = hash(w);
            if(!map.containsKey(key)) map.put(key, new LinkedList<String>());
            map.get(key).add(w);
        }

        return new ArrayList<>(map.values());
    }

    String hash(String s){
        int[] a = new int[26];
        for(char c : s.toCharArray()) a[c-'a']++;
        return Arrays.toString(a);
    }
//    public List<List<String>> groupAnagrams2(String[] strs) {
//        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();
//        for (String str : strs) {
//            Map<Character, Integer> count = new HashMap<>();
//            for (char chr : str.toCharArray()) {
//                count.put(chr, count.getOrDefault(chr, 0)+1);
//            }
//            map.computeIfAbsent(count, k -> new ArrayList<>()).add(str);
//        }
//        return map.values().stream()
//                .collect(java.util.stream.Collectors.toList());
//    }
}