package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question28Test {

	@InjectMocks
	private Question28 question28;
	
	@Test
	public void getFindSecondLargestDistinctTest(){
	    int[] arr = {12, 35, 1, 10, 34, 1};
	    when(question28.findSecondLargestDistinct(arr)).thenReturn(34);
		int actual = question28.findSecondLargestDistinct(arr);
		assertEquals(34, actual);
	}
}
