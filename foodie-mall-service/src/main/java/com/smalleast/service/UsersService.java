package com.smalleast.service;

import com.smalleast.bo.UserBo;
import com.smalleast.pojo.Users;

public interface UsersService {
    /**
     * 判断用户名是否存在
     * @param username
     * @return boolean
     */
    public boolean queryUserNameIsExist(String username);

    /**
     * 创建用户
     * @param userBo
     * @return
     */
    public Users createUser(UserBo userBo);
}
