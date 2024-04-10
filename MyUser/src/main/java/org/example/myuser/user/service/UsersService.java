package org.example.myuser.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.myuser.user.domain.Users;

/**
* @author genki
* @description 针对表【users】的数据库操作Service
* @createDate 2024-04-07 15:57:47
*/
public interface UsersService extends IService<Users> {
    // 创建用户
    boolean createUser(Users users);

    String login(String username, String password);
}
