package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question29Test {

	@InjectMocks
	private Question29 question29;
	
	@Test
	public void getFindPairSumCountTest(){
		int[] nums = {1, 1, 1, 1};
	    int K = 2;
	    when(question29.findPairSumCount(nums, K)).thenReturn(6);
		int actual = question29.findPairSumCount(nums,K);
		assertEquals(6, actual);
	}
}
