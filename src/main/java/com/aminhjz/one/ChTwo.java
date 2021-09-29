package com.aminhjz.one;
import com.aminhjz.one.linkedlist.Node;

public class ChTwo {
    /**
     * 
     * @param <T>
     * @param head
     * @return
     */
    public static <T> Node<T> removeDuplicates(Node<T> head){
        Node<T> node = head;
        Node<T> runner = null;
        Node<T> prev = null;
        while (node.getNext() != null){
            runner = node;
            while (runner.getNext() != null){
                if (runner != null && 
                    prev != null && 
                    runner.getValue().equals(node.getValue())){
                    prev.setNext(runner.getNext());
                }
                prev = runner;
                runner = runner.getNext();
            }
        
            node = node.getNext();
            prev = null;
        }
        return head;
    }
}
