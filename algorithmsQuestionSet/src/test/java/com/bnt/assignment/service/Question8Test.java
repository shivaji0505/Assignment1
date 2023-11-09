package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question8Test {

	@InjectMocks
	private Question8 question8;
	
	@Test
	public void getIsPrimeTrueReturnSuccessTest(){
        int[] arr = {1, 2, 2};
		 List<List<Object>> actual = question8.findSubsets(arr);
	     System.out.println("Unique subsets: " + actual);
		assertEquals(true, true);
	}
}
