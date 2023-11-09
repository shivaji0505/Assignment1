package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question13Test {

	@InjectMocks
	private Question13 question13;
	
	@Test
	public void getThirdLargestTest(){
		int[] arr = {2,4,1,3,5};
		when(question13.thirdLargest(arr)).thenReturn(3);
		int actual = question13.thirdLargest(arr);
		assertEquals(3, actual);
	}
	
	@Test
	public void getThirdLargestForArSize2Test(){
		int[] arr = {10,2};
		when(question13.thirdLargest(arr)).thenReturn(-1);
		int actual = question13.thirdLargest(arr);
		assertEquals(-1, actual);
	}
}
