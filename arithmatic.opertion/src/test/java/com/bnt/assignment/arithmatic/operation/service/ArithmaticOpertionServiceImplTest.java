package com.bnt.assignment.arithmatic.operation.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;



public class ArithmaticOpertionServiceImplTest {

	@InjectMocks
	private ArithmaticOpertionService arithmaticOpertionService;

	@Test
	public void getAddNumbersReturnSuccessTest(){
		Integer number1 = 10;
	    Integer number2 = 2;
	    Integer answer = 12;
		when(arithmaticOpertionService.getAddNumbers(number1,number2)).thenReturn(answer);
		Integer actual = arithmaticOpertionService.getAddNumbers(number1,number2);
		assertEquals(answer, actual);
	}
	
	@Test
	public void getSubNumbersReturnSuccessTest(){
		Integer number1 = 10;
	    Integer number2 = 2;
	    Integer answer = 8;
		when(arithmaticOpertionService.getSubNumbers(number1,number2)).thenReturn(answer);
		Integer actual = arithmaticOpertionService.getSubNumbers(number1,number2);
		assertEquals(answer, actual);
	}
	
	@Test
	public void getMultiplyNumbersReturnSuccessTest(){
		Integer number1 = 10;
	    Integer number2 = 2;
	    Integer answer = 20;
		when(arithmaticOpertionService.getMultiplyNumbers(number1,number2)).thenReturn(answer);
		Integer actual = arithmaticOpertionService.getMultiplyNumbers(number1,number2);
		assertEquals(answer, actual);
	}
	
	@Test
	public void getDivideNumbersReturnSuccessTest(){
		Integer number1 = 10;
	    Integer number2 = 2;
	    Integer answer = 5;
		when(arithmaticOpertionService.getDivideNumbers(number1,number2)).thenReturn(answer);
		Integer actual = arithmaticOpertionService.getDivideNumbers(number1,number2);
		assertEquals(answer, actual);
	}
	
	@Test
	public void getSquareOfNumberReturnSuccessTest(){
		Integer number = 5;
	    Integer answer = 25;
		when(arithmaticOpertionService.getSquareOfNumber(number)).thenReturn(answer);
		Integer actual = arithmaticOpertionService.getSquareOfNumber(number);
		assertEquals(answer, actual);
	}
	
	@Test
	public void getSquareRootOfNumberReturnSuccessTest(){
		Integer number = 225;
	    Integer answer = 15;
		when(arithmaticOpertionService.getSquareRootOfNumber(number)).thenReturn(answer);
		Integer actual = arithmaticOpertionService.getSquareRootOfNumber(number);
		assertEquals(answer, actual);
	}
	
	@Test
	public void getFactorialOfNumberReturnSuccessTest(){
		Integer number = 6;
	    Integer answer = 720;
		when(arithmaticOpertionService.getFactorialOfNumber(number)).thenReturn(answer);
		Integer actual = arithmaticOpertionService.getFactorialOfNumber(number);
		assertEquals(answer, actual);
	}
	
	@Test
	public void getMinAndMaxNumberReturnSuccessTest(){
		Integer[] numArray={2,5,8,5,9,0};
        Map<String, Integer> minMaxMap = new HashMap<String, Integer>();
        minMaxMap.put("min", 0);
        minMaxMap.put("max", 9);
		when(arithmaticOpertionService.getMinAndMaxNumber(numArray)).thenReturn(minMaxMap);
		 Map<String, Integer> actual = arithmaticOpertionService.getMinAndMaxNumber(numArray);
		assertEquals(minMaxMap.get("min"), actual.get("min"));
		assertEquals(minMaxMap.get("max"), actual.get("max"));
	}
}
