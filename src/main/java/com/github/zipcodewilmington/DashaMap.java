package com.github.zipcodewilmington;

import com.github.zipcodewilmington.mylinkedlist.MyLinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap implements HashMapX{
    // private vars
   private MyLinkedList[] dash;
    // constructor
    public DashaMap(){
        dash = new MyLinkedList[26];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < dash.length; i++){
            dash[i] = new MyLinkedList("" + alphabet.charAt(i));
        }
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}
