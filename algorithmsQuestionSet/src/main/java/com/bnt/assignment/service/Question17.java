package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question17 {

	    public int isSubsequence(String A, String B) {
	        int m = A.length();
	        int n = B.length();
	        int j = 0;
	        for (int i = 0; i < n && j < m; i++) {
	            if (A.charAt(j) == B.charAt(i)) {
	                j++;
	            }
	        }
	        return (j == m)?1:0;
	    }
	}






