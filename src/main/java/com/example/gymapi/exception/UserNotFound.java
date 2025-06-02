package com.example.gymapi.exception;

public class UserNotFound extends RuntimeException{
    public UserNotFound() {
        super("User Id you entered was not found...Can you please try again");
    }
}
