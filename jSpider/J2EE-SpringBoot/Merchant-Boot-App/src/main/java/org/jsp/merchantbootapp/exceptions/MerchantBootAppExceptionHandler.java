package org.jsp.merchantbootapp.exceptions;

import org.jsp.merchantbootapp.dto.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MerchantBootAppExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(MerchantNotFound.class)
	public ResponseEntity<ResponseStructure<String>> handleICE (MerchantNotFound e){
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setMessage(e.getMessage());
		structure.setData("Can't Find Merchant");
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_FOUND);
	}
	
	
}
