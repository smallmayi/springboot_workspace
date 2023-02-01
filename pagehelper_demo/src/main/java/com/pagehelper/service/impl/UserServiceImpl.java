package com.pagehelper.service.impl;

import com.pagehelper.domain.User;
import com.pagehelper.mapper.UserMapper;
import com.pagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryList() {
        return userMapper.queryList();
    }
}




