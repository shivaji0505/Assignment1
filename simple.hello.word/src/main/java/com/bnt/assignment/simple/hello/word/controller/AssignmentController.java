package com.bnt.assignment.simple.hello.word.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentController {

	@GetMapping("/greetapi/v1/hello")
    public @ResponseBody ResponseEntity<String> getHelloWorld(@RequestParam(value = "name", defaultValue = "World") String userName) {
		
		ResponseEntity <String> responseEntity = null;
		try {
			String customeString = "Hello " + userName + " !!!" ;
			responseEntity =  new ResponseEntity<String>(customeString, HttpStatus.OK);
		}
		catch(Exception ex) {
			responseEntity =  new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
}
