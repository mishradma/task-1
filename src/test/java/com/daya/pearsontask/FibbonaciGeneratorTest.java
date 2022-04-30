package com.daya.pearsontask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibbonaciGeneratorTest {

    @Test
    void generateSeries() {
        List<Integer> list= FibbonaciGenerator.generateSeries(5);
        Assertions.assertEquals(5,list.size());
        Assertions.assertEquals(3,list.get(4));
    }
    @Test
    void generateSeries21() {
        List<Integer> list= FibbonaciGenerator.generateSeries(21);
        Assertions.assertEquals(21,list.size());
        Assertions.assertEquals(3,list.get(4));
        Assertions.assertEquals(6765,list.get(20));
//        list.forEach(item->System.out.println(item));
    }
}