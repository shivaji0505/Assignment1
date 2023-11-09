package com.bnt.assignment.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Question6 {

	public ArrayList<Integer> Series(int N) {
        ArrayList<Integer> fibonacciSeries = new ArrayList<>();
        if (N == 0) {
            return fibonacciSeries;
        }
        fibonacciSeries.add(0);
        if (N == 1) {
            return fibonacciSeries;
        }
        fibonacciSeries.add(1);
        for (int i = 2; i < N; i++) {
            int nextTerm = fibonacciSeries.get(i - 1) + fibonacciSeries.get(i - 2);
            fibonacciSeries.add(nextTerm);
        }
        return fibonacciSeries;
    }
}
