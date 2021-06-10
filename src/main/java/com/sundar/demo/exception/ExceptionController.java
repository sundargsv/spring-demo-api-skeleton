package com.sundar.demo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
@Slf4j
public class ExceptionController {
    @ExceptionHandler(value = ApiException.class)
    public ResponseEntity<HashMap> exception(ApiException exception) {
        log.error("Got API exception with code={}, message={}", exception.getCode(), exception.getMessage());
        return new ResponseEntity<>(new HashMap<String, String>() {{
            put("message", exception.getMessage());
            put("httpStatus", exception.getHttpStatus().getReasonPhrase());
            put("code", exception.getResponseCode());
        }}, HttpStatus.OK);
    }
}