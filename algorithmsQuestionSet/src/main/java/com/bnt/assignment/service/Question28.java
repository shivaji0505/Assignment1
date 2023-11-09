package com.bnt.assignment.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class Question28 {

	    public int findSecondLargestDistinct(int[] arr) {
	        Arrays.sort(arr);
	        int n = arr.length;
	        int largest = arr[n - 1];
	        for (int i = n - 2; i >= 0; i--) {
	            if (arr[i] != largest) {
	                return arr[i];
	            }
	        }
	        return -1;
	    }
	}


