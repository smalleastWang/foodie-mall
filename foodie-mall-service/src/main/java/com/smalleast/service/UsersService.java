package com.smalleast.service;

public interface UsersService {
    /**
     * 判断用户名是否存在
     * @param username
     * @return boolean
     */
    public boolean queryUserNameIsExist(String username);
}
