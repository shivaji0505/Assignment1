package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question2Test {

	@InjectMocks
	private Question2 question2;
	
	@Test
	public void getIsPalindromeTrueTest(){
        int number = 555;
		when(question2.isPalindrome(number)).thenReturn("Yes");
		String actual = question2.isPalindrome(number);
		assertEquals("Yes", actual);
	}
	
	@Test
	public void getIsPalindromeFalseTest(){
        int number = 123;
		when(question2.isPalindrome(number)).thenReturn("No");
		String actual = question2.isPalindrome(number);
		assertEquals("No", actual);
	}
}
