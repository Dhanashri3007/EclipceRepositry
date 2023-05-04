package com.demo.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.demo.errorResponce.ErrorApi;

@RestControllerAdvice
public class GlobalExceptionHandller {

	@ExceptionHandler(UserNotFount.class)
	public ResponseEntity<ErrorApi> usernNotFoundException(UserNotFount e,
			HttpServletRequest request)
	{
		ErrorApi error=new ErrorApi(HttpStatus.NOT_FOUND.value(),e.getMessage(), HttpStatus.NOT_FOUND, new Date(),request.getRequestURI());
		return new ResponseEntity<ErrorApi>(error,HttpStatus.NOT_FOUND);
	}
}
