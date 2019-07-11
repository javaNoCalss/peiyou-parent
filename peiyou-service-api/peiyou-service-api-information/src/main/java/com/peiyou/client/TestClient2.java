package com.peiyou.client;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = "资料服务测试")
public interface TestClient2 {

    @ApiOperation("资料服务测试")
    @GetMapping("test")
    void test();
}
