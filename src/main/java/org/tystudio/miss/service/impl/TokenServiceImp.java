package org.tystudio.miss.service.impl;

import org.tystudio.miss.entity.Token;
import org.tystudio.miss.mapper.TokenMapper;
import org.tystudio.miss.service.TokenService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-28
 */
@Service
public class TokenServiceImp extends ServiceImpl<TokenMapper, Token> implements TokenService {

}
