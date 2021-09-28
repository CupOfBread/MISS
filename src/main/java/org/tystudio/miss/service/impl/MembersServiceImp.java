package org.tystudio.miss.service.impl;

import org.tystudio.miss.entity.Members;
import org.tystudio.miss.mapper.MembersMapper;
import org.tystudio.miss.service.MembersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 成员 服务实现类
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-28
 */
@Service
public class MembersServiceImp extends ServiceImpl<MembersMapper, Members> implements MembersService {

}
