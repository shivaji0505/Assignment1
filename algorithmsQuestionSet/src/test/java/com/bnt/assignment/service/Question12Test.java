package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question12Test {

	@InjectMocks
	private Question12 question12;
	
	@Test
	public void getzigZagTest(){
		int n = 7;
		int[] arr = {4, 3, 7, 8, 6, 2, 1};
		int[] ExpecetdArr = {3, 7, 4, 8, 2, 6, 1};
		when(question12.zigZag(arr,n)).thenReturn(1);
		int actual = question12.zigZag(arr,n);
		assertEquals(1, actual);
		assertEquals(Arrays.toString(arr) ,ExpecetdArr);
	}
}
