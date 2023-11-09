package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question20 {

	    public int classifyString(String S) {
	        int vowelCount = 0;
	        int consonantCount = 0;
	        boolean isBad = false;
	        for (int i = 0; i < S.length(); i++) {
	            char c = S.charAt(i);
	            if (c == '?') {
	                vowelCount++;
	                consonantCount++;
	            } else if (isVowel(c)) {
	                vowelCount++;
	                consonantCount = 0;
	            } else {
	                consonantCount++;
	                vowelCount = 0;
	            }
	            if (vowelCount > 5 || consonantCount > 3) {
	                isBad = true;
	                break;
	            }
	        }
	        return isBad ? 0 : 1;
	    }

	    private static boolean isVowel(char c) {
	        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	    }
	}

