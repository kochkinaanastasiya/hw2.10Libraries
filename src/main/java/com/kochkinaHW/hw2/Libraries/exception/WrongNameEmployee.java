package com.kochkinaHW.hw2.Libraries.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongNameEmployee extends RuntimeException{
}
