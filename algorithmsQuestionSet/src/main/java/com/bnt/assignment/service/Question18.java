package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question18 {
	    
	    public int[] searchRange(int[] nums, int target) {
	        int firstOccurrence = findFirstOccurrence(nums, target);
	        if (firstOccurrence == -1) {
	            return new int[]{-1, -1};
	        }
	        int lastOccurrence = findLastOccurrence(nums, target);
	        return new int[]{firstOccurrence, lastOccurrence};
	    }

	    private static int findFirstOccurrence(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return (nums[left] == target) ? left : -1;
	    }

	    private static int findLastOccurrence(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        while (left < right) {
	            int mid = left + (right - left + 1) / 2;
	            if (nums[mid] > target) {
	                right = mid - 1;
	            } else {
	                left = mid;
	            }
	        }
	        return (nums[right] == target) ? right : -1;
	    }
	}
