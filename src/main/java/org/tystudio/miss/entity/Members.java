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
 * 成员
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-28
 */
@Data
@Accessors(chain = true)
@TableName("miss_members")
@ApiModel(value = "Members对象", description = "成员")
public class Members {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("组名")
    private String groupName;

    @ApiModelProperty("用户id")
    private Integer userId;


}
