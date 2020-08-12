package com.ailjushkin.service;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HelloWorldService {

    @Autowired
    public HelloWorldService() {

    }

    public String getAllUsers() {
        return "Hello World";
    }
}
