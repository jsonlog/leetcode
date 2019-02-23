package com.jsonlog.algorithms._127;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) {
            return 0;
        }
        wordList.add(endWord);
        Queue<String> queue = new LinkedList<String>();
        queue.add(beginWord);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                String cur = queue.remove();
                if(cur.equals(endWord)){ return level + 1;}
                for(int j = 0; j < cur.length(); j++){
                    char[] word = cur.toCharArray();
                    for(char ch = 'a'; ch < 'z'; ch++){
                        if(word[j] == ch) continue;
                        word[j] = ch;
                        String check = new String(word);
                        if(wordList.contains(check)){
                            queue.add(check);
                            wordList.remove(check);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }
}