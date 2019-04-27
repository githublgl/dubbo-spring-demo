package com.demo.provider;

import org.springframework.stereotype.Service;

import com.demo.TestService;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String testM() {

        return "This is test..";
    }

}
