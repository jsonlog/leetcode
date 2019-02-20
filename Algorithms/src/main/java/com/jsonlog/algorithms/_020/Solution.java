package com.jsonlog.algorithms._020;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by log on 10/1/2019.
 */
public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
class Stack<T> {

    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v){
        storage.addFirst(v);
    }
    public T peek(){
        return storage.getFirst();
    }
    public T pop(){
        return storage.removeFirst();
    }
    public boolean empty(){
        return storage.isEmpty();
    }
    public String toString(){
        return storage.toString();
    }
    public int size(){
        return storage.size();
    }
}
