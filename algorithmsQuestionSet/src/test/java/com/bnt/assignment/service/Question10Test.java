package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question10Test {

	@InjectMocks
	private Question10 question10;
	
	@Test
	public void getMaxRectangleAreaTest(){
        int[][] rect = {{1, 2}, {3, 4}, {5, 6}};
		when(question10.maxRectangleArea(rect)).thenReturn(30);
		int actual = question10.maxRectangleArea(rect);
		assertEquals(30, actual);
	}
}
