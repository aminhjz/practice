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
        //arr: 1, 2, 3
        //j=-;cur = 1;prev=null
        //j=0;cur = 2;prev=1
        //j=1;prev = 2;curr = 3
        Node<T> current = head;
        Node<T> prev = null;
        for (int j=0; j < i; j++){
            prev = current;
            current = current.next;
        }
        //
        if(prev == null){
            head = current.next;
        } else {
            prev.next = current.next;
        }
    }

    public T get(int index){
        Node<T> node = head;
        for (int i=0; i < index && node != null; i++){
            node = node.next;
        }

        return node !=null? node.getValue(): null;
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
