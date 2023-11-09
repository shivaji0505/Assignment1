package com.bnt.assignment.service;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class Question21 {
	
	    public boolean isFrequencyUnique(int[] arr) {
	        Map<Integer, Integer> frequencyMap = new HashMap<>();
	        for (int num : arr) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        Set<Integer> uniqueFrequencies = new HashSet<>();
	        for (int freq : frequencyMap.values()) {
	            if (!uniqueFrequencies.add(freq)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

