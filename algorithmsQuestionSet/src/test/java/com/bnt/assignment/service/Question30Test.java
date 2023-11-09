package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question30Test {

	@InjectMocks
	private Question30 question30;
	
	@Test
	public void getMaxProductTest(){
        int[] nums = {2, 3, 4, 5, -1, 0};
	    when(question30.maxProduct(nums)).thenReturn(120);
		int actual = question30.maxProduct(nums);
		assertEquals(120, actual);
	}
}
