package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question24 {

	    public int minCharsToAddForPalindrome(String str) {
	        int n = str.length();
	        int count = 0;
	        int i = 0, j = n - 1;

	        while (i < j) {
	            if (str.charAt(i) == str.charAt(j)) {
	                i++;
	                j--;
	            } else {
	                j = n - 1;
	                count++;
	                i = count;
	            }
	        }
	        return count;
	    }
	}

