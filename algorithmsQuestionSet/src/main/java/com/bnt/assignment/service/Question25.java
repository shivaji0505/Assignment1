package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question25 {

	    public int findMissingElement(int[] nums, int n) {
	        int totalSum = (n * (n + 1)) / 2;
	        int arraySum = 0;
	        for (int num : nums) {
	            arraySum += num;
	        }
	        return totalSum - arraySum;
	    }
	}

