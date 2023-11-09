package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question3Test {

	@InjectMocks
	private Question3 question3;
	
	@Test
	public void getFactorialTest(){
        int n = 5;
		when(question3.factorial(n)).thenReturn(120);
		int actual = question3.factorial(n);
		assertEquals(120, actual);
	}
	
	@Test
	public void getFactorialForZeroTest(){
        int n = 0;
		when(question3.factorial(n)).thenReturn(1);
		int actual = question3.factorial(n);
		assertEquals(1, actual);
	}
}
