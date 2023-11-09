package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question23Test {

	@InjectMocks
	private Question23 question23;
	
	@Test
	public void getMaxProfitTest(){
        int[] prices = {1, 3, 5, 7, 9};
	    when(question23.maxProfit(prices)).thenReturn(1);
		int actual = question23.maxProfit(prices);
		assertEquals(1, actual);
	}
}
