package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question14Test {

	@InjectMocks
	private Question14 question14;
	
	@Test
	public void getPrint2SmallestTest(){
        int[] arr = { 6, 1, 2, 1, 3, 6, 7};
        int[] newArr = {1,2};
		when(question14.print2Smallest(arr)).thenReturn(newArr);
		int[] actual =question14.print2Smallest(arr);
		assertEquals(newArr, actual);
	}
}
