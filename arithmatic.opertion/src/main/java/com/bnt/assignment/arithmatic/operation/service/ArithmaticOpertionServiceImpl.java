package com.bnt.assignment.arithmatic.operation.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ArithmaticOpertionServiceImpl implements ArithmaticOpertionService {

	public Integer getAddNumbers(Integer number1, Integer number2) {
		Integer sum = number1+number2 ;
		return 	 sum ;
	}

	public Integer getSubNumbers(Integer number1, Integer number2) {
		Integer answer = number1-number2 ;
		return answer;
	}

	public Integer getMultiplyNumbers(Integer number1, Integer number2) {
		Integer answer = number1*number2 ;
		return answer;
	}

	public Integer getDivideNumbers(Integer number1, Integer number2) {
		Integer answer=null;
		if (number2!=0) {
		    answer = number1/number2 ;
		} else {
			throw new IllegalArgumentException();
		}
		return answer;
	}

	public Integer getSquareOfNumber(Integer number) {
		Integer square=number*number;
		return square;
	}

	public Integer getSquareRootOfNumber(Integer number) {
		Integer squareRoot=(int) Math.sqrt(number);
		return squareRoot;
	}

	public Integer getFactorialOfNumber(Integer number) {
		Integer factorial=calculateFactorial(number);
		return factorial;
	}
	
	public static Integer calculateFactorial(Integer number) {
        if (number == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

	public Map<String, Integer> getMinAndMaxNumber(Integer[] numArray) {
		Map<String, Integer> minAndMaxNumber=calculateMinAndMaxNumber(numArray);
		return minAndMaxNumber;
	}
	
	public static Map<String, Integer> calculateMinAndMaxNumber(Integer[] numArray) {
        Map<String, Integer> minMaxMap = new HashMap<String, Integer>();
		Integer minNumber = numArray[0];
		Integer maxNumber = numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] < minNumber) {
            	minNumber = numArray[i];
            }
            if (numArray[i] > maxNumber) {
            	maxNumber = numArray[i];
            }
        }
        minMaxMap.put("min", minNumber);
        minMaxMap.put("max", maxNumber);
        return 	minMaxMap ;
        
    }

}
