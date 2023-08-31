package com.cengizhanyavuz.TechCareer_FullStack_2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 401: yetkisiz giriş
@ResponseStatus(value=HttpStatus.CREATED)
public class ResourceCreatedException extends RuntimeException{

    public ResourceCreatedException(String message) {
        super(message);
    }
}