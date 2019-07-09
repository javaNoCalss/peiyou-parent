package com.peiyou.client;

import com.peiyou.TestDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = "测试接口")
public interface TestClient {

    @ApiOperation("测试")
    @GetMapping("/test")
    TestDto test();
}
