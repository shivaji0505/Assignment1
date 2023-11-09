package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question20Test {

	@InjectMocks
	private Question20 question20;
	
	@Test
	public void getClassifyStringGoodTest(){
		String s1 = "aeioup??";
	    when(question20.classifyString(s1)).thenReturn(1);
	    int actual = question20.classifyString(s1);
		assertEquals(1, actual);
	}
	
	@Test
	public void getClassifyStringBadTest(){
		String s1 = "bcdaeiou??";
	    when(question20.classifyString(s1)).thenReturn(0);
	    int actual = question20.classifyString(s1);
		assertEquals(0, actual);
	}
}
