package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question12 {

	public int zigZag(int[] arr, int n) {
	        boolean flag = true;

	        for (int i = 0; i <= n - 2; i++) {
	            if (flag) {
	                if (arr[i] > arr[i + 1]) {
	                    swap(arr, i, i + 1);
	                }
	            } else {
	                if (arr[i] < arr[i + 1]) {
	                    swap(arr, i, i + 1);
	                }
	            }
	            flag = !flag;
	        }

	        for (int i = 1; i < n - 1; i++) {
	            if (i % 2 == 1) {
	                if (arr[i] <= arr[i - 1] || arr[i] <= arr[i + 1]) {
	                    return 0;
	                }
	            } else {
	                if (arr[i] >= arr[i - 1] || arr[i] >= arr[i + 1]) {
	                    return 0;
	                }
	            }
	        }
	        return 1;
	    }

	    public static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	}



