package com.bnt.assignment.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class Question13 {
	    public  int thirdLargest(int[] arr) {
	        Arrays.sort(arr);
	        if (arr.length < 3) {
	            return -1;
	        } else {
	            return arr[arr.length - 3];
	        }
	    }
	}


