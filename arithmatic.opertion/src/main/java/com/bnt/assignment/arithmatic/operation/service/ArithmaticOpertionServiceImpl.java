package com.bnt.assignment.arithmatic.operation.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bnt.assignment.arithmatic.operation.dao.CalculatorDao;
import com.bnt.assignment.arithmatic.operation.entity.RequestResponseEntity;

@Service()
public class ArithmaticOpertionServiceImpl implements ArithmaticOpertionService {

	@Autowired
	CalculatorDao calDao;
	
	@Cacheable(value = "CalculatorCache", key = "'addition:' + #num1 + ',' + #num2", unless = "#result == null")
	public Integer getAddNumbers(Integer number1, Integer number2) {
		Integer sum = number1+number2 ;
		return 	 sum ;
	}

	@Cacheable(value = "CalculatorCache", key = "'substration:' + #num1 + ',' + #num2", unless = "#result == null")
	public Integer getSubNumbers(Integer number1, Integer number2) {
		Integer answer = number1-number2 ;
		return answer;
	}

	@Cacheable(value = "CalculatorCache", key = "'multiplication:' + #num1 + ',' + #num2", unless = "#result == null")
	public Integer getMultiplyNumbers(Integer number1, Integer number2) {
		Integer answer = number1*number2 ;
		return answer;
	}

	@Cacheable(value = "CalculatorCache", key = "'division:' + #num1 + ',' + #num2", unless = "#result == null")
	public Integer getDivideNumbers(Integer number1, Integer number2) {
		Integer answer=null;
		if (number2!=0) {
		    answer = number1/number2 ;
		} else {
			throw new IllegalArgumentException();
		}
		return answer;
	}

	@Cacheable(value = "CalculatorCache", key = "'square:'+ #num", unless = "#result == null")
	public Integer getSquareOfNumber(Integer number) {
		Integer square=number*number;
		return square;
	}


	@Cacheable(value = "CalculatorCache", key = "'squareroot:'+#num", unless = "#result == null")
	public Integer getSquareRootOfNumber(Integer number) {
		Integer squareRoot=(int) Math.sqrt(number);
		return squareRoot;
	}

	@Cacheable(value = "CalculatorCache", key = "'factorial:'+#num", unless = "#result == null")
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
	
	@Cacheable(value = "CalculatorCache", key = "'maxMin:'+ #numbers", unless = "#result == null")
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
	
   public void saveData(String request,String message) {
			RequestResponseEntity requestResponseEntity=new RequestResponseEntity();
			requestResponseEntity.setRequest(request);
			requestResponseEntity.setResponse(message);
			requestResponseEntity.setTime(new java.util.Date());
			calDao.save(requestResponseEntity);
	}
}
