package com.lawani.webservices.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProjectIdentifierException extends RuntimeException{

	public ProjectIdentifierException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
