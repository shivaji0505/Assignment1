package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question26 {

	    public int kthSmallest(int[] arr, int l, int r, int k) {
	        if (k > 0 && k <= r - l + 1) {
	            int pos = partition(arr, l, r);
	            if (pos - l == k - 1) {
	                return arr[pos];
	            }
	            if (pos - l > k - 1) {
	                return kthSmallest(arr, l, pos - 1, k);
	            }
	            return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
	        }
	        return Integer.MAX_VALUE;
	    }

	    public static int partition(int[] arr, int l, int r) {
	        int x = arr[r];
	        int i = l;
	        for (int j = l; j <= r - 1; j++) {
	            if (arr[j] <= x) {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                i++;
	            }
	        }
	        int temp = arr[i];
	        arr[i] = arr[r];
	        arr[r] = temp;
	        return i;
	    }
	}


