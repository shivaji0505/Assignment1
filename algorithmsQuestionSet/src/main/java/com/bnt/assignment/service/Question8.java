package com.bnt.assignment.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Question8 {

	 public List<List<Object>> findSubsets(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Object>> result = new ArrayList<>();
	        backtrack(result, new ArrayList<Object>(), nums, 0);
	        return result;
	    }

	    private static void backtrack(List<List<Object>> result, ArrayList<Object> tempList, int[] nums, int start) {
	        result.add(new ArrayList<>(tempList));
	        for (int i = start; i < nums.length; i++) {
	            if (i > start && nums[i] == nums[i - 1]) continue; // skip duplicates
	            tempList.add(nums[i]);
	            backtrack(result, tempList, nums, i + 1);
	            tempList.remove(tempList.size() - 1);
	        }
	    }
}
