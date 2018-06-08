package com.zll.service;

import com.zll.model.User;

import java.util.List;

public interface UserService {
    public int addUser(User user);

    public List<User> getAllUser(int pageNum,int pageSize);
}
