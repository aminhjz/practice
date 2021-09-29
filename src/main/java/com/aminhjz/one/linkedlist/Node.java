package com.aminhjz.one.linkedlist;

public class Node<T> {
    Node<T> next= null;
    private T value;
    public Node(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public Node<T> getNext(){
        return next;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }
}
