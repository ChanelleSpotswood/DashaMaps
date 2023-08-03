package com.github.zipcodewilmington.mylinkedlist;

public class MyLinkedList {

    MyNode head;

    public MyLinkedList(String key) {
        head = new MyNode(key, null);
    }
    public MyNode getHead() {
        return head;
    }
    public void add(String key, Integer value) {
        MyNode currentNode = head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new MyNode(key, value));
    }

    public void remove(int index){

    }

    public int size() {
        MyNode currentNode = head;
        int counter = 1;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return counter;
    }
}
