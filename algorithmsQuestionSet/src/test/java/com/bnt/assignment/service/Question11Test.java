package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question11Test {

	@InjectMocks
	private Question11 question11;
	
	@Test
	public void getIsPrimeTrueReturnSuccessTest(){
        int[] numArr = {4, 2, 1, 5, 3};
        int[] expecetdNumArr = {2,1,-1,3,-1};
		when(question11.CheckAdjacentElements(numArr)).thenReturn(expecetdNumArr);
		int[] actual = question11.CheckAdjacentElements(numArr);
		assertEquals(expecetdNumArr, actual);
	}
}
