package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question14 {
	
	    public  int[] print2Smallest(int arr[]) {
	        int[] newArr = {};
	        int n = arr.length;
	        if (n < 2) {
	            return newArr;
	        }

	        int first = Integer.MAX_VALUE;
	        int second = Integer.MAX_VALUE;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] < first) {
	                second = first;
	                first = arr[i];
	            } else if (arr[i] < second && arr[i] != first) {
	                second = arr[i];
	            }
	        }
	        newArr[0]=first;
	        newArr[1]=second;

	        return newArr;
	    }
	}


