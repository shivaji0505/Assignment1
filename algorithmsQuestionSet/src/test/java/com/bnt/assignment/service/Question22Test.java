package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question22Test {

	@InjectMocks
	private Question22 question22;
	
	@Test
	public void getStockBuySellTrueTest(){
        int[] prices = {4,2,2,2,4};
	    when(question22.stockBuySell(prices)).thenReturn(1);
		int actual = question22.stockBuySell(prices);
		assertEquals(1, actual);
	}
	
	@Test
	public void getStockBuySellFalseTest(){
        int[] prices = {4,2,2,2,4};
	    when(question22.stockBuySell(prices)).thenReturn(1);
		int actual = question22.stockBuySell(prices);
		assertEquals(0, actual);
	}
}
