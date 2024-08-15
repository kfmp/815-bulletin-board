package com.board.api.common;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CommonResponse<T> {
	
	  private final int code;
	   private final T data;

	   public static <T> ResponseEntity<CommonResponse<T>> success(HttpStatus status, T data) {

	      return ResponseEntity
	         .status(status)
	         .contentType(MediaType.APPLICATION_JSON)
	         .body(new CommonResponse<>(status.value(), data));
	   }


	   public static <T> ResponseEntity<CommonResponse<T>> successWithHeader(HttpHeaders headers, HttpStatus status,
	      int code, T data) {

	      return ResponseEntity
	         .status(status)
	         .headers(headers)
	         .body(new CommonResponse<>(status.value(), data));
	   }
	   
	   public static ResponseEntity<CommonResponse<String>> fail(HttpStatus status, String errorMessage){
			/*
			 * status.OK.getReasonPhrase(); status.OK.value();
			 */
		   return ResponseEntity.status(status)
			         .contentType(MediaType.APPLICATION_JSON)
			         .body(new CommonResponse<>(status.value(), errorMessage));
	   }

	

}
