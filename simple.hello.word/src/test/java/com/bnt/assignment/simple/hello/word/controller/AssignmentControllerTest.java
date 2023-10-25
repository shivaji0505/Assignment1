package com.bnt.assignment.simple.hello.word.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@ExtendWith(MockitoExtension.class)
public class AssignmentControllerTest {
	@InjectMocks
	AssignmentController assignmentController;
	
	@Test
	public void getHelloWorldWithNameSuccessTest() throws Exception {
        String name = "yogesh";
		when(assignmentController.getHelloWorld(name)).thenReturn(new ResponseEntity<String>(HttpStatus.OK));
		ResponseEntity<String> helloWorld = assignmentController.getHelloWorld(name);
		assertEquals(HttpStatus.OK.value(), helloWorld.getStatusCode().value());			
	}
	
	@Test
	public void getHelloWorldWithoutNameSuccessTest() throws Exception {
        String name = null;
		when(assignmentController.getHelloWorld(name)).thenReturn(new ResponseEntity<String>(HttpStatus.OK));
		ResponseEntity<String> helloWorld = assignmentController.getHelloWorld(name);
		assertEquals(HttpStatus.OK.value(), helloWorld.getStatusCode().value());			
	}
}