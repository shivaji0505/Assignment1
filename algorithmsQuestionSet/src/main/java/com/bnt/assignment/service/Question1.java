package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question1 {

	 public int isPrime(int N) {
	        if (N <= 1) {
	            return 0;
	        }
	        for (int i = 2; i <= Math.sqrt(N); i++) {
	            if (N % i == 0) {
	                return 0;
	            }
	        }
	        return 1;
	    }
}
