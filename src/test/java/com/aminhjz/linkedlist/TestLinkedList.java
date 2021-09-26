package com.aminhjz.linkedlist;

import com.aminhjz.one.linkedlist.LinkedList;
import com.aminhjz.one.linkedlist.Node;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TestLinkedList {
    @Test
    public void testLinklistAdd(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        Assertions.assertEquals(1, list.get(0));
    
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    public void TestLinkedListDelete(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        Assertions.assertEquals(2, list.get(1));
        list.delete(1);
        Assertions.assertEquals(3, list.get(1));
    }
}
