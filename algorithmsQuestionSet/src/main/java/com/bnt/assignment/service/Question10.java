package com.bnt.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class Question10 {

	public int maxRectangleArea(int[][] rect) {
		int maxArea = 0;
        for (int i = 0; i < rect.length - 1; i++) {
            for (int j = i + 1; j < rect.length; j++) {
                int length = Math.abs(rect[i][0] - rect[j][0]);
                int width = Math.abs(rect[i][1] - rect[j][1]);
                maxArea = Math.max(maxArea, length * width);
            }
        }
        return maxArea;
    }
}
