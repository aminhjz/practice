package com.aminhjz.one.linkedlist;

public class LinkedList<T> {
    private Node<T> head;

    public void add(T value){
        if (head == null){
            head = new Node<T>(value);
            return;
        }
        Node<T> end = head;
        while (end.next != null){
            end = end.next;
        }
        end.next = new Node<>(value);
    }

    public void delete(int i){
        Node<T> next = head.next;
        Node<T> prev = null;;
        for (int j=0; j <= i; j++){
            prev = next;
            next = head.next;
        }
        prev.next = next;
        
    }

    public T get(int index){
        Node<T> node = head;
        for (int i=0; i < index; i++){
            node = node.next;
        }

        return node.getValue();
    }

    public void removeDuplicates(){
        Node<T> node = head;
        Node<T> runner = null;
        Node<T> prev = null;
        while (node.next != null){
            while (runner.next != null){
                if (runner != null && 
                    prev != null && 
                    runner.getValue().equals(node.getValue())){
                    prev.next = runner.next;
                }
                prev = runner;
                runner = runner.next;
            }
            runner = node;
            node = node.next;
        }
    }
}
