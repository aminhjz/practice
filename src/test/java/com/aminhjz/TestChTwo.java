package com.aminhjz;

import com.aminhjz.one.ChTwo;
import com.aminhjz.one.linkedlist.LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestChTwo {
    
    @Test
    public void removeDuplicateTest(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(3);
        Assertions.assertEquals(2, linkedList.get(1));
        Assertions.assertEquals(2, linkedList.get(2));

        ChTwo.removeDuplicates(linkedList.getHead());

        Assertions.assertEquals(2, linkedList.get(1));
        Assertions.assertEquals(3, linkedList.get(2));
    }
}
