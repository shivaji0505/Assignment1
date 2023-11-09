package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question7 {

	public int maxExtraAmount(int actualAmount) {
        String actualAmountStr = String.valueOf(actualAmount);
        String maxPossibleStr = actualAmountStr.replace("6", "9");
        int maxPossibleAmount = Integer.parseInt(maxPossibleStr);
        return maxPossibleAmount - actualAmount;
    }
}
