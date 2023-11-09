package com.bnt.assignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Question16 {

	    public List<Integer> sieveOfEratosthenes(int n) {
	        List<Integer> primes = new ArrayList<>();
	        boolean[] sieve = new boolean[n + 1];
	        for (int i = 2; i <= n; i++) {
	            sieve[i] = true;
	        }
	        for (int p = 2; p * p <= n; p++) {
	            if (sieve[p]) {
	                for (int i = p * p; i <= n; i += p) {
	                    sieve[i] = false;
	                }
	            }
	        }
	        for (int i = 2; i <= n; i++) {
	            if (sieve[i]) {
	                primes.add(i);
	            }
	        }
	        return primes;
	    }
	}




