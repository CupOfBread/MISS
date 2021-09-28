package org.tystudio.miss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-28
 */
@Data
@Accessors(chain = true)
@TableName("miss_user")
@ApiModel(value = "User对象", description = "用户")
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("头像")
    private String gravatar;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("手机号码")
    private String phone;

    @ApiModelProperty("注册时间")
    private LocalDateTime createTime;


}
