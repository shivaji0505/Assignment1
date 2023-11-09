package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question5 {
	
	public int nthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(b);
        }
        return b;
    }
}
