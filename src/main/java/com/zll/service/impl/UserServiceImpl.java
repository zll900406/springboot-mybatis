package com.zll.service.impl;

import com.github.pagehelper.PageHelper;
import com.zll.mapper.UserMapper;
import com.zll.model.User;
import com.zll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> getAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return userMapper.selectAllUser();
    }
}
