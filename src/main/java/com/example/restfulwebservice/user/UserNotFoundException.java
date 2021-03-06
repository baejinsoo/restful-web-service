package com.example.restfulwebservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// HTTP status code
// 2XX -> OK
// 4XX -> Client error
// 5XX -> Server error
@ResponseStatus(HttpStatus.NOT_FOUND) // 404 Not Found
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
