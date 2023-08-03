package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.mylinkedlist.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {

    @Test
    public void setNextTest(){
        // given
        MyNode first = new MyNode("dolio", 1);
        MyNode second = new MyNode("kris", 3);
        // when
        first.setNext(second);
        // then
        Assert.assertEquals(second, first.getNext());
    }

    @Test
    public void equalsTest(){
        // given
        MyNode node1 = new MyNode("chanelle", 10);
        MyNode node2 = new MyNode("chanelle", 10);

        // when, then
        Assert.assertEquals(node1, node2);
    }
}
