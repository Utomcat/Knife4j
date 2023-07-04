package com.ranyk.knife4j.data.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS_NAME: UserVO.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 用户实体类  <br/>
 * @date: 2023-07-04 <br/>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "用户User", description = "用户实体对象")
public class UserVO {

    /**
     * 姓名
     */
    @Schema(name = "name", description = "姓名",example = "张三")
    private String name;

    /**
     * 电话
     */
    @Schema(name = "phone", description = "电话", example = "13330834375")
    private String phone;

}
