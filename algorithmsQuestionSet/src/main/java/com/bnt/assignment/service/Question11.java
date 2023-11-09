package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question11 {

	
	public int[] CheckAdjacentElements(int[] numArr) {
		int N = numArr.length;
        for (int i = 0; i < N - 1; i++) {
            if (numArr[i + 1] < numArr[i]) {
            	numArr[i] = numArr[i + 1];
            } else {
            	numArr[i] = -1;
            }
        }
        numArr[N - 1] = -1;
       return numArr;
      }
}
