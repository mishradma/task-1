package com.daya.pearsontask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangerTest {

    @Test
    void doChange() {
        Map<String,Integer> actual = CoinChanger.doChange(44);
        Assertions.assertEquals(2,actual.get("20P"));
        Assertions.assertEquals(2,actual.get("2P"));
    }
    @Test
    void doChange1() {
        Map<String,Integer> actual = CoinChanger.doChange(45);
        Assertions.assertEquals(2,actual.get("20P"));
        Assertions.assertEquals(1,actual.get("5P"));
        Assertions.assertEquals(2,actual.size());
    }
    @Test
    void doChange2() {
        Map<String,Integer> actual = CoinChanger.doChange(46);
        Assertions.assertEquals(2,actual.get("20P"));
        Assertions.assertEquals(1,actual.get("5P"));
        Assertions.assertEquals(1,actual.get("1P"));
        Assertions.assertEquals(3,actual.size());
    }
    @Test
    void doChange3() {
        Map<String,Integer> actual = CoinChanger.doChange(47);
        Assertions.assertEquals(2,actual.get("20P"));
        Assertions.assertEquals(1,actual.get("5P"));
        Assertions.assertEquals(1,actual.get("2P"));
        Assertions.assertEquals(3,actual.size());
    }
    @Test
    void doChange39() {
        Map<String,Integer> actual = CoinChanger.doChange(39);
        Assertions.assertEquals(1,actual.get("20P"));
        Assertions.assertEquals(1,actual.get("10P"));
        Assertions.assertEquals(1,actual.get("5P"));
        Assertions.assertEquals(2,actual.get("2P"));
        Assertions.assertEquals(4,actual.size());
    }
}