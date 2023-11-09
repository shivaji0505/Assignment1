package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question26Test {

	@InjectMocks
	private Question26 question26;
	
	@Test
	public void getKthSmallestTest(){
        int[] arr = { 7, 10, 4, 3, 20, 15};
        int k = 3;
	    when(question26.kthSmallest(arr, 0, arr.length - 1, k)).thenReturn(7);
		int actual = question26.kthSmallest(arr, 0, arr.length - 1, k);
		assertEquals(7, actual);
	}
}
