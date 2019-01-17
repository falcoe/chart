package me.greatyhh.chart.service.impl;

import me.greatyhh.chart.model.entity.User;
import me.greatyhh.chart.mapper.UserMapper;
import me.greatyhh.chart.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author greatyhh
 * @since 2019-01-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
