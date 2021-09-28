package org.tystudio.miss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * <p>
 * 位置记录
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-28
 */
@Data
@Accessors(chain = true)
@TableName("miss_loc_record")
@ApiModel(value = "LocRecord对象", description = "位置记录")
public class LocRecord {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户id")
    private Integer userId;

    @ApiModelProperty("记录创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createTime;

    @ApiModelProperty("定位成功时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date locTime;

    @ApiModelProperty("定位精度")
    private Double radius;

    @ApiModelProperty("纬度")
    private Double latitude;

    @ApiModelProperty("经度")
    private Double longitude;

    @ApiModelProperty("高度")
    private Double altitude;

    @ApiModelProperty("省份")
    private String province;

    @ApiModelProperty("城市")
    private String city;

    @ApiModelProperty("区县")
    private String district;

    @ApiModelProperty("乡镇")
    private String town;

    @ApiModelProperty("街道")
    private String street;

    @ApiModelProperty("地址")
    private String address;

    @ApiModelProperty("位置语义化描述，例如“在百度大厦附近”")
    private String locationDetail;


}
