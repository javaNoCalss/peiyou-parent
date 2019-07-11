package com.peiyou.controller;

import com.peiyou.client.TestClient2;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestClient2 {

    @Override
    public void test() {

    }
}
