package com.bnt.assignment.arithmatic.operation.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bnt.assignment.arithmatic.operation.dto.RequestMinMax;
import com.bnt.assignment.arithmatic.operation.dto.Response;
import com.bnt.assignment.arithmatic.operation.dto.ResponseMinMax;
import com.bnt.assignment.arithmatic.operation.service.ArithmaticOpertionService;

@ExtendWith(MockitoExtension.class)
public class AssignmentControllerTest {
	
	@InjectMocks
	AssignmentController assignmentController;
	
	@Mock
	private ArithmaticOpertionService arithmaticOpertionService;
	
	@Test
	public void getAdditionSuccessTest() throws Exception {
		Integer number1 = 5;
	    Integer number2 = 3;
	    Integer answer = 8;
		when(arithmaticOpertionService.getAddNumbers(number1,number2)).thenReturn(answer);
		when(assignmentController.getAddition(number1,number2)).thenReturn(new ResponseEntity<Response>(HttpStatus.OK));
		ResponseEntity<Response> sum = assignmentController.getAddition(number1,number2);
		assertEquals(HttpStatus.OK.value(), sum.getStatusCode().value());			
	}
	
	@Test
	public void getSubtractionSuccessTest() throws Exception {
		Integer number1 = 5;
	    Integer number2 = 3;
	    Integer answer = 2;
		when(arithmaticOpertionService.getSubNumbers(number1,number2)).thenReturn(answer);
		when(assignmentController.getSubtraction(number1,number2)).thenReturn(new ResponseEntity<Response>(HttpStatus.OK));
		ResponseEntity<Response> actualanswer = assignmentController.getSubtraction(number1,number2);
		assertEquals(HttpStatus.OK.value(), actualanswer.getStatusCode().value());			
	}
	
	@Test
	public void getMultiplicationSuccessTest() throws Exception {
		Integer number1 = 5;
	    Integer number2 = 3;
	    Integer answer = 15;
		when(arithmaticOpertionService.getMultiplyNumbers(number1,number2)).thenReturn(answer);
		when(assignmentController.getMultiplication(number1,number2)).thenReturn(new ResponseEntity<Response>(HttpStatus.OK));
		ResponseEntity<Response> actualAnswer = assignmentController.getMultiplication(number1,number2);
		assertEquals(HttpStatus.OK.value(), actualAnswer.getStatusCode().value());			
	}
	
	@Test
	public void getDivisionSuccessTest() throws Exception {
		Integer number1 = 10;
	    Integer number2 = 5;
	    Integer answer = 2;
	  	when(arithmaticOpertionService.getDivideNumbers(number1,number2)).thenReturn(answer);
		when(assignmentController.getDivision(number1,number2)).thenReturn(new ResponseEntity<Response>(HttpStatus.OK));
		ResponseEntity<Response> actualAnswer = assignmentController.getDivision(number1,number2);
		assertEquals(HttpStatus.OK.value(), actualAnswer.getStatusCode().value());			
	}
	
	@Test
	public void getSquareSuccessTest() throws Exception {
		Integer number = 5;
		Integer answer = 25;
	  	when(arithmaticOpertionService.getSquareOfNumber(number)).thenReturn(answer);
		when(assignmentController.getSquare(number)).thenReturn(new ResponseEntity<Response>(HttpStatus.OK));
		ResponseEntity<Response> square = assignmentController.getSquare(number);
		assertEquals(HttpStatus.OK.value(), square.getStatusCode().value());			
	}
	
	@Test
	public void getSquarerootSuccessTest() throws Exception {
		Integer number = 225;
		Integer answer = 15;
	  	when(arithmaticOpertionService.getSquareRootOfNumber(number)).thenReturn(answer);
		when(assignmentController.getSquareRoot(number)).thenReturn(new ResponseEntity<Response>(HttpStatus.OK));
		ResponseEntity<Response> squareroot = assignmentController.getSquareRoot(number);
		assertEquals(HttpStatus.OK.value(), squareroot.getStatusCode().value());			
	}
	
	@Test
	public void getFactorialSuccessTest() throws Exception {
		Integer number = 5;
		Integer answer = 120;
	  	when(arithmaticOpertionService.getFactorialOfNumber(number)).thenReturn(answer);
		when(assignmentController.getFactorial(number)).thenReturn(new ResponseEntity<Response>(HttpStatus.OK));
		ResponseEntity<Response> factorial = assignmentController.getFactorial(number);
		assertEquals(HttpStatus.OK.value(), factorial.getStatusCode().value());			
	}
	
	@Test
	public void getFactorialForZeroSuccessTest() throws Exception {
		Integer number = 0;
		Integer answer = 1;
	  	when(arithmaticOpertionService.getFactorialOfNumber(number)).thenReturn(answer);
		when(assignmentController.getFactorial(number)).thenReturn(new ResponseEntity<Response>(HttpStatus.OK));
		ResponseEntity<Response> factorial = assignmentController.getFactorial(number);
		assertEquals(HttpStatus.OK.value(), factorial.getStatusCode().value());			
	}
	
	@Test
	public void getMinAndMaxNumberSuccessTest() throws Exception {
		Integer[] numArray={2,5,8,5,9,0};
	    Map<String, Integer> minMaxMap = new HashMap<String, Integer>();
		RequestMinMax requestMinMax=new RequestMinMax();
		requestMinMax.setNumArray(numArray);
		minMaxMap.put("min", 0);
	    minMaxMap.put("max", 9);
	  	when(arithmaticOpertionService.getMinAndMaxNumber(numArray)).thenReturn(minMaxMap);
		when(assignmentController.getMinAndMaxNumber(requestMinMax)).thenReturn(new ResponseEntity<ResponseMinMax>(HttpStatus.OK));
		ResponseEntity<ResponseMinMax> minAndMaxNumber = assignmentController.getMinAndMaxNumber(requestMinMax);
		assertEquals(HttpStatus.OK.value(), minAndMaxNumber.getStatusCode().value());			
	}
	
}
