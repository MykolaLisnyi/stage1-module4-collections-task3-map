package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.split("[.,\\-?!:;\\s]+");
        for (String word : words) {
            if (!word.isEmpty()) {
                map.merge(word.toLowerCase(), 1, Integer::sum);
            }
        }
        return map;
    }
}