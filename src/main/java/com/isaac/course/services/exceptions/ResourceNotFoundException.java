package com.isaac.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Long id) {
		super("Resource Not Found ID = " + id );
		
	}

}
