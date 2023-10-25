package com.bnt.assignment.arithmatic.operation.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bnt.assignment.arithmatic.operation.dto.Response;
import com.bnt.assignment.arithmatic.operation.dto.ResponseMinMax;
import com.bnt.assignment.arithmatic.operation.dto.RequestMinMax;
import com.bnt.assignment.arithmatic.operation.service.ArithmaticOpertionService;

@RestController
@RequestMapping("/calculatorapi/v1")
public class AssignmentController {
	
	@Autowired
    private ArithmaticOpertionService arithmaticOpertionService;
	
	@GetMapping("/addition")
    public @ResponseBody ResponseEntity<Response> getAddition(@RequestParam(value = "number1") Integer number1,@RequestParam(value = "number2") Integer number2) {
		ResponseEntity <Response> responseEntity = null;
		try {
			Integer sum = arithmaticOpertionService.getAddNumbers(number1, number2) ;
            String detail = number1 + " +  " + number2 + " = " + sum;
            Response response = new Response(sum, detail);
			responseEntity =  new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		catch(Exception ex) {
			responseEntity =  new ResponseEntity<Response>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping("/subtraction")
    public @ResponseBody ResponseEntity<Response> getSubtraction(@RequestParam(value = "number1") Integer number1,@RequestParam(value = "number2") Integer number2) {
		ResponseEntity <Response> responseEntity = null;
		try {
			Integer answer = arithmaticOpertionService.getSubNumbers(number1, number2) ;
            String detail = number1 + " - " + number2 + " = " + answer;
            Response response = new Response(answer, detail);
			responseEntity =  new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		catch(Exception ex) {
			responseEntity =  new ResponseEntity<Response>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping("/multiplication")
    public @ResponseBody ResponseEntity<Response> getMultiplication(@RequestParam(value = "number1") Integer number1,@RequestParam(value = "number2") Integer number2) {
		ResponseEntity <Response> responseEntity = null;
		try {
			Integer answer = arithmaticOpertionService.getMultiplyNumbers(number1, number2) ;
			String detail = number1 + " * " + number2 + " = " + answer;
            Response response = new Response(answer, detail);
			responseEntity =  new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		catch(Exception ex) {
			responseEntity =  new ResponseEntity<Response>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping("/division")
    public @ResponseBody ResponseEntity<Response> getDivision(@RequestParam(value = "number1") Integer number1,@RequestParam(value = "number2") Integer number2) {
		ResponseEntity <Response> responseEntity = null;
		try {
			Integer answer = arithmaticOpertionService.getDivideNumbers(number1, number2) ;
			String detail = number1 + " / " + number2 + " = " + answer;
			Response response = new Response(answer, detail);
			responseEntity =  new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		catch(Exception ex) {
			responseEntity =  new ResponseEntity<Response>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}

	@GetMapping("/square/{number}")
    public @ResponseBody ResponseEntity<Response> getSquare(@PathVariable Integer number) {
		ResponseEntity <Response> responseEntity = null;
		try {
			Integer square=arithmaticOpertionService.getSquareOfNumber(number);
			String detail = "square of "+number+" = " +square;
			Response response = new Response(square, detail);
			responseEntity =  new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		catch(Exception ex) {
			responseEntity =  new ResponseEntity<Response>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping("/squareroot/{number}")
    public @ResponseBody ResponseEntity<Response> getSquareRoot(@PathVariable Integer number) {
		ResponseEntity <Response> responseEntity = null;
		try {
			Integer squareRoot=arithmaticOpertionService.getSquareRootOfNumber(number);
			String detail = "squareroot of "+number+" = " +squareRoot;
			Response response = new Response(squareRoot, detail);
			responseEntity =  new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		catch(Exception ex) {
			responseEntity =  new ResponseEntity<Response>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping("/factorial/{number}")
    public @ResponseBody ResponseEntity<Response> getFactorial(@PathVariable Integer number) {
		ResponseEntity <Response> responseEntity = null;
		try {
			Integer factorial=arithmaticOpertionService.getFactorialOfNumber(number);
			String detail = +number+" ! = " +factorial;
			Response response = new Response(factorial, detail);
			responseEntity =  new ResponseEntity<Response>(response, HttpStatus.OK);
		}
		catch(Exception ex) {
			responseEntity =  new ResponseEntity<Response>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	
	@PostMapping("/min-max")
    public @ResponseBody ResponseEntity<ResponseMinMax> getMinAndMaxNumber(@RequestBody RequestMinMax numbers) {
		ResponseEntity <ResponseMinMax> responseEntity = null;
		try {
			Map<String, Integer> minMaxMap=arithmaticOpertionService.getMinAndMaxNumber(numbers.getNumArray());
			ResponseMinMax responseMinMax=new ResponseMinMax(minMaxMap.get("min"),minMaxMap.get("max"));
			responseEntity =  new ResponseEntity<ResponseMinMax>(responseMinMax, HttpStatus.OK);
		}
		catch(Exception ex) {
			responseEntity =  new ResponseEntity<ResponseMinMax>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
        
}