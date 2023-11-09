package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question5Test {

	@InjectMocks
	private Question5 question5;
	
	@Test
	public void getNthFibonacciTest(){
        int n = 5;
		when(question5.nthFibonacci(n)).thenReturn(5);
		int actual = question5.nthFibonacci(n);
		assertEquals(5, actual);
	}
	
	@Test
	public void getNthFibonacciForOneTest(){
        int n = 1;
		when(question5.nthFibonacci(n)).thenReturn(1);
		int actual = question5.nthFibonacci(n);
		assertEquals(1, actual);
	}
}
