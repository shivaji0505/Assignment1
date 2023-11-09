package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question6Test {

	@InjectMocks
	private Question6 question6;
	
	
	@Test
	public void getSeriesForTest(){
        int n = 5;
        ArrayList<Integer> expectedFibonacciSeries = new ArrayList<>();
        expectedFibonacciSeries.add(0);
        expectedFibonacciSeries.add(1);
        expectedFibonacciSeries.add(1);
        expectedFibonacciSeries.add(2);
        expectedFibonacciSeries.add(3);
        expectedFibonacciSeries.add(5);
		when(question6.Series(n)).thenReturn(expectedFibonacciSeries);
		ArrayList<Integer> actualFibonacciSeries = question6.Series(n);
		assertEquals(expectedFibonacciSeries, actualFibonacciSeries);
	}
	
	@Test
	public void getSeriesForZeroTest(){
        int n = 0;
        ArrayList<Integer> expectedFibonacciSeries = new ArrayList<>();
        expectedFibonacciSeries.add(0);
		when(question6.Series(n)).thenReturn(expectedFibonacciSeries);
		ArrayList<Integer> actualFibonacciSeries = question6.Series(n);
		assertEquals(expectedFibonacciSeries, actualFibonacciSeries);
	}
	
	@Test
	public void getSeriesForOneTest(){
        int n = 1;
        ArrayList<Integer> expectedFibonacciSeries = new ArrayList<>();
		when(question6.Series(n)).thenReturn(expectedFibonacciSeries);
		ArrayList<Integer> actualFibonacciSeries = question6.Series(n);
		assertEquals(expectedFibonacciSeries, actualFibonacciSeries);
	}
}
