package com.ranyk.knife4j.data.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS_NAME: UserEntity.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 用户实体对象  <br/>
 * @date: 2023-07-04 <br/>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "User", description = "用户实体对象")
public class UserEntity {

    /**
     * 姓名
     */
    @Schema(name = "姓名", example = "张三")
    private String name;

    /**
     * 电话
     */
    @Schema(name = "电话", example = "13330834375")
    private String phone;

}
