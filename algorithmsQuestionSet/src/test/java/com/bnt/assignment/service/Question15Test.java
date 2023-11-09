package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question15Test {

	@InjectMocks
	private Question15 question15;
	
	@Test
	public void getMakeAnagramTest(){
		String s1 = "cddgk";
	    String s2 = "gcd";	
	    when(question15.makeAnagram(s1, s2)).thenReturn(3);
		int actual = question15.makeAnagram(s1,s2);
		assertEquals(3, actual);
	}
}
