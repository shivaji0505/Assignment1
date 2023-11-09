package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question7Test {

	@InjectMocks
	private Question7 question7;
	
	@Test
	public void getMaxExtraAmountTest(){
        int n = 56;
		when(question7.maxExtraAmount(n)).thenReturn(3);
		int actual = question7.maxExtraAmount(n);
		assertEquals(3, actual);
	}
}
