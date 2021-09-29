package org.tystudio.miss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.tystudio.miss.entity.User;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
