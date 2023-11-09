package com.bnt.assignment.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class Question15 {

	    public int makeAnagram(String s1, String s2) {
	        Map<Character, Integer> map1 = new HashMap<>();
	        Map<Character, Integer> map2 = new HashMap<>();
	        for (char c : s1.toCharArray()) {
	            map1.put(c, map1.getOrDefault(c, 0) + 1);
	        }
	        for (char c : s2.toCharArray()) {
	            map2.put(c, map2.getOrDefault(c, 0) + 1);
	        }
	        int deletions = 0;
	        for (char c : map1.keySet()) {
	            if (!map2.containsKey(c)) {
	                deletions += map1.get(c);
	            } else {
	                deletions += Math.abs(map1.get(c) - map2.get(c));
	            }
	        }

	        for (char c : map2.keySet()) {
	            if (!map1.containsKey(c)) {
	                deletions += map2.get(c);
	            }
	        }

	        return deletions;
	    }
	}



