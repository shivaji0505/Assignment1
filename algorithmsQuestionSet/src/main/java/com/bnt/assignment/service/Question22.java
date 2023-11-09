package com.bnt.assignment.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Question22 {

	    static class Interval {
	        int buy;
	        int sell;
	    }

	    public int stockBuySell(int[] prices) {
	        int n = prices.length;
	        if (n == 1) {
	            return 0;
	        }

	        int count = 0;
	        List<Interval> solution = new ArrayList<>();
	        int i = 0;
	        while (i < n - 1) {
	            while (i < n - 1 && prices[i + 1] <= prices[i]) {
	                i++;
	            }
	            if (i == n - 1) {
	                break;
	            }
	            Interval interval = new Interval();
	            interval.buy = i++;
	            while (i < n && prices[i] >= prices[i - 1]) {
	                i++;
	            }
	            interval.sell = i - 1;
	            solution.add(interval);
	            count++;
	        }

	        if (count == 0) {
	            return 0;
	        } else {
	            return 1;
	        }
	    }
	}

