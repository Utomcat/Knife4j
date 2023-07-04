package com.ranyk.knife4j.api;

import com.ranyk.knife4j.data.vo.UserVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CLASS_NAME: TestApi.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 测试接口  <br/>
 * @date: 2023-07-03 <br/>
 */
@RestController
@Tag(name = "测试API接口")
@RequestMapping(value = "test")
public class TestApi {

    @GetMapping("/getOneUser")
    @Operation(summary = "获取用户", description = "获取某个用户测试接口")
    public ResponseEntity<UserVO> getOneUser() {
        return ResponseEntity.ok(new UserVO("姓名", "13899999999"));
    }

}
