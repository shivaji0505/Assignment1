package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question9Test {

	@InjectMocks
	private Question9 question9;
	
	@Test
	public void getCountDistinctEvenSubsetsTest(){
        int[] arr = {4, 2, 1, 9, 2, 6, 5, 3};
		when(question9.countDistinctEvenSubsets(arr)).thenReturn(7);
		int actual = question9.countDistinctEvenSubsets(arr);
		assertEquals(7, actual);
	}
	
	@Test
	public void getCountDistinctEvenSubsetsForEmptyArrTest(){
        int[] arr = {};
		when(question9.countDistinctEvenSubsets(arr)).thenReturn(0);
		int actual = question9.countDistinctEvenSubsets(arr);
		assertEquals(0, actual);
	}
}
