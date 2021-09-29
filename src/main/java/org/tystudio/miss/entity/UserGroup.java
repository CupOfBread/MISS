package org.tystudio.miss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户组
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-29
 */
@Data
@Accessors(chain = true)
@TableName("miss_user_group")
@ApiModel(value = "UserGroup对象", description = "用户组")
public class UserGroup {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户组名")
    private String name;


}
