package com.bnt.assignment.arithmatic.operation.service;

import java.util.Map;

public interface ArithmaticOpertionService {

	Integer getAddNumbers(Integer number1, Integer number2);
	Integer getSubNumbers(Integer number1, Integer number2);
	Integer getMultiplyNumbers(Integer number1, Integer number2);
	Integer getDivideNumbers(Integer number1, Integer number2);
	Integer getSquareOfNumber(Integer number);
	Integer getSquareRootOfNumber(Integer number);
	Integer getFactorialOfNumber(Integer number);
	Map<String, Integer> getMinAndMaxNumber(Integer[] numArray);
}
