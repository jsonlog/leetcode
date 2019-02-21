package com.jsonlog.algorithms;

import java.util.Deque;
import java.util.ArrayDeque;

public class Stack<T> {
    private Deque<T> storage = new ArrayDeque<>();
    public void push(T v) { storage.push(v); }
    public T peek() { return storage.peek(); }
    public T pop() { return storage.pop(); }
    public boolean isEmpty() { return storage.isEmpty(); }
    @Override
    public String toString() {
        return storage.toString();
    }
}
/*
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
 */
