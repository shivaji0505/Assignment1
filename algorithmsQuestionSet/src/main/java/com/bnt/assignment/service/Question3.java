package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question3 {

	public int factorial(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= N; i++) {
            result *= i;
        }
        return result;
    }
}
