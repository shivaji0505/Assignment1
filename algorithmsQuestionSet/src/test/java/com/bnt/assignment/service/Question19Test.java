package com.bnt.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class Question19Test {

	@InjectMocks
	private Question19 question19;
	
	@Test
	public void getMergeStringsTest(){
		 String s1 = "Hello";
	     String s2 = "Bye";	
	    when(question19.mergeStrings(s1, s2)).thenReturn("HBeylelo");
	    String actual = question19.mergeStrings(s1,s2);
		assertEquals("HBeylelo", actual);
	}
}
