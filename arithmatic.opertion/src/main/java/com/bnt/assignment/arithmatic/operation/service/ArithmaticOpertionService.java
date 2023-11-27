package com.bnt.assignment.arithmatic.operation.service;

import java.util.Map;

import com.bnt.assignment.arithmatic.operation.entity.RequestResponseEntity;

public interface ArithmaticOpertionService {

	Integer getAddNumbers(Integer number1, Integer number2);
	Integer getSubNumbers(Integer number1, Integer number2);
	Integer getMultiplyNumbers(Integer number1, Integer number2);
	Integer getDivideNumbers(Integer number1, Integer number2);
	Integer getSquareOfNumber(Integer number);
	Integer getSquareRootOfNumber(Integer number);
	Integer getFactorialOfNumber(Integer number);
	Map<String, Integer> getMinAndMaxNumber(Integer[] numArray);
	RequestResponseEntity saveLog(String string, String string2);
}
