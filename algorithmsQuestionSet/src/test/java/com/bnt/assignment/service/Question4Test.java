package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question4Test {

	@InjectMocks
	private Question4 question4;
	
	@Test
	public void getIsPalindromeTrueTest(){
        String str = "abba";
		when(question4.isPalindrome(str)).thenReturn(1);
		int actual = question4.isPalindrome(str);
		assertEquals(1, actual);
	}
	
	@Test
	public void getIsPalindromeFalseTest(){
        String str = "abc";
		when(question4.isPalindrome(str)).thenReturn(1);
		int actual = question4.isPalindrome(str);
		assertEquals(0, actual);
	}
}
