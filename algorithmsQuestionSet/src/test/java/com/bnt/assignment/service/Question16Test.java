package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question16Test {

	@InjectMocks
	private Question16 question16;
	
	@Test
	public void getSieveOfEratosthenesTest(){
		 int n = 10;
	    List<Integer> expectedResult = new ArrayList<>();
	    expectedResult.add(2);
	    expectedResult.add(3);
	    expectedResult.add(5);
	    expectedResult.add(7);
	    when(question16.sieveOfEratosthenes(n)).thenReturn(expectedResult);
	    List<Integer> actual = question16.sieveOfEratosthenes(n);
		assertEquals(expectedResult, actual);
	}
}
