package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question21Test {

	@InjectMocks
	private Question21 question21;
	
	@Test
	public void getIsFrequencyUniqueTrueTest(){
        int[] arr = {2, 2, 5, 10, 1, 2, 10, 5, 10, 2};
	    when(question21.isFrequencyUnique(arr)).thenReturn(true);
	    boolean actual = question21.isFrequencyUnique(arr);
		assertEquals(true, actual);
	}
	
	@Test
	public void getIsFrequencyUniqueFalseTest(){
        int[] arr = {1, 1, 2, 5, 5};
	    when(question21.isFrequencyUnique(arr)).thenReturn(false);
	    boolean actual = question21.isFrequencyUnique(arr);
		assertEquals(false, actual);
	}
}
