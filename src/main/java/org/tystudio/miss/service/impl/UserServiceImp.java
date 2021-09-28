package org.tystudio.miss.service.impl;

import org.tystudio.miss.entity.User;
import org.tystudio.miss.mapper.UserMapper;
import org.tystudio.miss.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-28
 */
@Service
public class UserServiceImp extends ServiceImpl<UserMapper, User> implements UserService {

}
