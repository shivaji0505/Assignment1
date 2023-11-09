package com.bnt.assignment.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class Question9 {
	
	 public int countDistinctEvenSubsets(int[] nums) {
	        Arrays.sort(nums);
	        Set<List<Object>> set = new HashSet<>();
	        backtrack(set, new ArrayList<>(), nums, 0);
	        return set.size();
	    }
	 
	  private static void backtrack(Set<List<Object>> set, ArrayList<Object> tempList, int[] nums, int start) {
	        if (tempList.size() > 0 && tempList.size() <= nums.length) {
	            set.add(new ArrayList<>(tempList));
	        }
	        for (int i = start; i < nums.length; i++) {
	            if (nums[i] % 2 == 0) {
	                tempList.add(nums[i]);
	                backtrack(set, tempList, nums, i + 1);
	                tempList.remove(tempList.size() - 1);
	            }
	        }
	    }
}
