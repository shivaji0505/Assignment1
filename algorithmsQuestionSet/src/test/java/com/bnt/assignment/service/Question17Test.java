package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question17Test {

	@InjectMocks
	private Question17 question17;
	
	@Test
	public void getIsSubsequenceTrueTest(){
		String s1 = "cddgk";
	    String s2 = "gcd";	
	    when(question17.isSubsequence(s1, s2)).thenReturn(1);
	    int actual = question17.isSubsequence(s1, s2);
		assertEquals(1, actual);
	}
	
	@Test
	public void getIsSubsequencFalseTest(){
		String s1 = "AXY";
	    String s2 = "YADXCP";	
	    when(question17.isSubsequence(s1, s2)).thenReturn(0);
	    int actual = question17.isSubsequence(s1, s2);
		assertEquals(0, actual);
	}
}
