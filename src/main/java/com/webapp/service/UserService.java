package com.webapp.service;

import com.webapp.entity.User;

public interface UserService {
    User selectByNameAndPassword(User user);
}
