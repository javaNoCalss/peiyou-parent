package com.peiyou.controller;


import com.peiyou.TestDto;
import com.peiyou.client.TestClient;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController implements TestClient {

    @Override
    public TestDto test() {
        TestDto testDto=new TestDto();
        testDto.setMsg("test success");
        return testDto;
    }
}
