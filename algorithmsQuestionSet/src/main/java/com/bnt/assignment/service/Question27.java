package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question27 {

	   public int findEquilibriumPoint(int[] arr) {
	        int totalSum = 0;
	        for (int num : arr) {
	            totalSum += num;
	        }

	        int leftSum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            totalSum -= arr[i];
	            if (leftSum == totalSum) {
	                return i + 1;
	            }
	            leftSum += arr[i];
	        }
	        return -1;
	    }
	}


