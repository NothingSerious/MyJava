package org.example.myuser.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.myuser.user.domain.Users;
import org.example.myuser.user.service.UsersService;
import org.example.myuser.user.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static com.alibaba.nacos.client.utils.EnvUtil.LOGGER;

/**
* @author genki
* @description 针对表【users】的数据库操作Service实现
* @createDate 2024-04-07 15:57:47
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
        implements UsersService{
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public boolean createUser(Users users) {
        if (users == null) {
            return false;
        }
        usersMapper.insert(users);
        return false;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        //密码需要客户端加密后传递
        try {
            if (Objects.isNull(username) || Objects.isNull(password)) {
                throw new Exception("用户名或密码不能为空");
            }
            QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("username",username);
            Users userDetails = usersMapper.selectOne(queryWrapper);
            if(!Objects.equals(password,userDetails.getPassword())){
                throw new Exception("密码不正确");

            }
            token = "xxx";
        } catch (Exception e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
            throw new RuntimeException(e);
        }
        return token;
    }
}
