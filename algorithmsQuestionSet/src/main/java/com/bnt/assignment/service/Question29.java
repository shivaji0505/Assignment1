package com.bnt.assignment.service;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class Question29 {

	    public int findPairSumCount(int[] nums, int K) {
	        Map<Integer, Integer> map = new HashMap<>();
	        int count = 0;
	        for (int num : nums) {
	            int complement = K - num;
	            if (map.containsKey(complement)) {
	                count += map.get(complement);
	            }
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }
	        return count;
	    }
	}


