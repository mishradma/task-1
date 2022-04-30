package com.daya.pearsontask;

import com.google.common.collect.Maps;

import java.util.*;
import java.util.stream.Collectors;

public class CoinChanger {
    /**
     * Coins are in Pence
     */
    private static List<Integer> availableCoins= Arrays.asList(1, 2, 5, 10, 20, 50, 100);
    public static Map<String, Integer> doChange(Integer number){
        Map<String, Integer> splittedMap= Maps.newHashMap();
        Integer tempNumber = number;
        List<Integer> filteredPossibleCoins= availableCoins.stream().filter(item->item<=number).collect(Collectors.toList());
        filteredPossibleCoins.sort((integer, t1) -> t1.compareTo(integer));
        for(int i=0;i<filteredPossibleCoins.size()&&tempNumber>0;i++){
            int count = tempNumber/filteredPossibleCoins.get(i);
            if(count>0) {
                tempNumber = tempNumber % filteredPossibleCoins.get(i);
                splittedMap.put(filteredPossibleCoins.get(i) + "P", count);
            }
        }
        return splittedMap;
    }
}
