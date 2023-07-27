package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        return sourceList.stream()
                .collect(Collectors.toMap(Function.identity(), s -> 5 * s + 2));
    }
}
