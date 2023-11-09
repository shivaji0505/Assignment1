package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question4 {

	 public int isPalindrome(String S) {
	        int left = 0;
	        int right = S.length() - 1;
	        
	        while (left < right) {
	            if (S.charAt(left) != S.charAt(right)) {
	                return 0;
	            }
	            left++;
	            right--;
	        }
	        return 1;
	    }
}
