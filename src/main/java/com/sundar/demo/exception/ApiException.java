/**
 * 
 */
package com.sundar.demo.exception;

import org.springframework.http.HttpStatus;

public class ApiException extends Exception {
	private static final long serialVersionUID = 1L;
	private final HttpStatus httpStatus;
	private final String responseCode;
	private final String code;
	
	
	public ApiException(String message, HttpStatus httpStatus, String code) {
		super(message);
		this.httpStatus = httpStatus;
		this.responseCode = Integer.toString(httpStatus.value());
		this.code = code;
	}

	public ApiException(String message, HttpStatus httpStatus) {
		super(message);
		this.httpStatus = httpStatus;
		this.responseCode = Integer.toString(httpStatus.value());
		this.code = null;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public String getCode() {
		return code;
	}
}
