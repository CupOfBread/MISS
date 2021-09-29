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
 * 
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-29
 */
@Data
@Accessors(chain = true)
@TableName("miss_token")
@ApiModel(value = "Token对象", description = "")
public class Token {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer userId;

    private String token;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expirationTime;


}
