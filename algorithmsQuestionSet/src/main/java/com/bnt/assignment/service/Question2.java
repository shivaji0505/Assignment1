package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question2 {

	public String isPalindrome(int number) {
        int reversed = 0;
        int original = number;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        if (original == reversed) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
