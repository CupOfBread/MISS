package org.tystudio.miss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-28
 */
@Data
@Accessors(chain = true)
@TableName("miss_token")
@ApiModel(value = "Token对象")
public class Token {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private String token;


}
