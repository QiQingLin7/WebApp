package com.webapp.service.impl;

import com.webapp.entity.User;
import com.webapp.mapper.UserMapper;
import com.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("user")
public class UserServiceImpl implements UserService {
    private final UserMapper mapper;

    @Autowired
    public UserServiceImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public User selectByNameAndPassword(User user) {
        return mapper.selectByNameAndPassword(user);
    }
}
