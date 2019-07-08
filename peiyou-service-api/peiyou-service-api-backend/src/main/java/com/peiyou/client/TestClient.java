package com.peiyou.client;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;

@Api(tags = "测试接口")
public interface TestClient {

    @ApiOperation("测试")
    @PostMapping("/test")
    public void test();
}
