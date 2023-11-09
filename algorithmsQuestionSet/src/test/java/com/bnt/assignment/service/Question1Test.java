package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question1Test {

	
	@InjectMocks
	private Question1 question1;
	
	@Test
	public void getIsPrimeTrueTest(){
        int n = 5;
		when(question1.isPrime(n)).thenReturn(1);
		int actual = question1.isPrime(n);
		assertEquals(1, actual);
	}
	
	@Test
	public void getIsPrimeFalseTest(){
        int n = 25;
		when(question1.isPrime(n)).thenReturn(0);
		int actual = question1.isPrime(n);
		assertEquals(0, actual);
	}
}
