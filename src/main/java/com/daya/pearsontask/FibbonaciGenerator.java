package com.daya.pearsontask;

import com.google.common.collect.Lists;

import java.util.List;

public final class FibbonaciGenerator {
        public static final List<Integer> generateSeries(int num){
            List<Integer> fibSeries= Lists.newArrayList();
            fibSeries.add(0);
            fibSeries.add(1);
            for(int i=2;i<num;i++){
                fibSeries.add(fibSeries.get(i-2)+fibSeries.get(i-1));
            }
            return fibSeries.subList(0,num);
        }

}
