package com.bnt.assignment.arithmatic.operation.dto;

public class ResponseMinMax {
	
	private Integer min;
    private Integer max;
    
    public ResponseMinMax(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }
    
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
}
