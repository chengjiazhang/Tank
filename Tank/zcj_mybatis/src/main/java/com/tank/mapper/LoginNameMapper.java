package com.tank.mapper;

import com.tank.domain.DO.LoginUser;

import java.util.List;

/**
 * @author: ZCJ
 * @Date: 2019-11-06 14:49
 * @Description:
 */
public interface LoginNameMapper {
    List<LoginUser> findAllByName(String name);
    void registerUser(LoginUser user);
}
