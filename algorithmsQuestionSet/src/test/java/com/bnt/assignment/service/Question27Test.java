package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question27Test {

	@InjectMocks
	private Question27 question27;
	
	@Test
	public void getFindMissingElementTest(){
        int[] arr = {1,3,5,2,2};
	    when(question27.findEquilibriumPoint(arr)).thenReturn(3);
		int actual = question27.findEquilibriumPoint(arr);
		assertEquals(3, actual);
	}
}
