package com.bnt.assignment.arithmatic.operation.dto;

public class Response {

	private Integer answer;
    private String detail;
    
    public Response(Integer answer, String detail) {
        this.answer = answer;
        this.detail = detail;
    }
    
	public Integer getAnswer() {
		return answer;
	}
	public void setAnswer(Integer answer) {
		this.answer = answer;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

}
