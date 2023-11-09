package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question18Test {

	@InjectMocks
	private Question18 question18;
	
	@Test
	public void getSearchRangeTest(){
		int[] nums = { 1, 3, 3, 4};
		int[] expecetdnums = { 1, 2};
        int target = 3;	
	    when(question18.searchRange(nums, target)).thenReturn(expecetdnums);
	    int[] actual =question18.searchRange(nums, target);
		assertEquals(expecetdnums[0], actual[0]);
		assertEquals(expecetdnums[1], actual[1]);
	}
}
