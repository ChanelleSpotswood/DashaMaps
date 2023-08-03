package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.mylinkedlist.MyLinkedList;
import com.github.zipcodewilmington.mylinkedlist.MyNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void add() {
        // given
        MyLinkedList mll = new MyLinkedList("chanelle");
        String expectedKey = "nicole";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        // when
        mll.add(expectedKey, expectedValue);
        MyNode actual = mll.getHead().getNext();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void remove() {
    }

    @Test
    void size() {
        // given
        int expected = 2;
        MyLinkedList mll = new MyLinkedList("chanelle");
        mll.add("nicole", 6);
        // when
        int actual = mll.size();
        // then
        Assert.assertEquals(expected, actual);

    }
}