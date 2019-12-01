package com.kevinmoura.cursomc.services.exceptions;

public class DataIntegrityViolationExceptionPersonalized extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataIntegrityViolationExceptionPersonalized(String msg) {
		super(msg);
	}
	
	public DataIntegrityViolationExceptionPersonalized(String msg, Throwable cause) {
		super(msg, cause);
	}
}
