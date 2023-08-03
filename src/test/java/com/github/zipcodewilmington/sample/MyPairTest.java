package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.mylinkedlist.MyPair;
import org.junit.Assert;
import org.junit.Test;

public class MyPairTest {

    @Test
    public void testSetKey() {
        // given
        String expectedKey = "pain";
        MyPair pair = new MyPair("no", 3);
        // when
        pair.setKey(expectedKey);
        String actualKey = pair.getKey();
        // then
        Assert.assertEquals(expectedKey, actualKey);
    }

    @Test
    public void testSetValue() {
        // given
        Integer expectedValue = 19;
        MyPair pair = new MyPair("no", 3);
        // when
        pair.setValue(expectedValue);
        Integer actualValue = pair.getValue();
        // then
        Assert.assertEquals(expectedValue, actualValue);
    }

        @Test
        public void testEquals() {
            // given
            MyPair mypair = new MyPair("no", 1);
            MyPair second = new MyPair("no", 1);

            Assert.assertEquals(mypair, second);
        }
    }

