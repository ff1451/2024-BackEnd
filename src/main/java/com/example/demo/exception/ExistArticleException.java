package com.example.demo.exception;

public class ExistArticleException extends RuntimeException {
    public ExistArticleException(String msg) {
        super(msg);
    }
}
