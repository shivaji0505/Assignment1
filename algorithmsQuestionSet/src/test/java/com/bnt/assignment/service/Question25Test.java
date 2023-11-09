package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question25Test {

	@InjectMocks
	private Question25 question25;
	
	@Test
	public void getFindMissingElementTest(){
        int[] nums = {6,1,2,8,3,4,7,10,5};
        int n = 10;
	    when(question25.findMissingElement(nums,n)).thenReturn(9);
		int actual = question25.findMissingElement(nums,n);
		assertEquals(9, actual);
	}
}
