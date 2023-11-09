package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question24Test {

	@InjectMocks
	private Question24 question24;
	
	@Test
	public void getMinCharsToAddForPalindromeTest(){
		String s1 = "ABCD";
	    when(question24.minCharsToAddForPalindrome(s1)).thenReturn(3);
		int actual = question24.minCharsToAddForPalindrome(s1);
		assertEquals(3, actual);
	}
}
