package org.tystudio.miss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 成员
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-29
 */
@Data
@Accessors(chain = true)
@TableName("miss_members")
@ApiModel(value = "Members对象", description = "成员")
public class Members {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("组名")
    private String groupName;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;


}
