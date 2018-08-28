package com.webapp.mapper;

import com.webapp.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectByNameAndPassword(User user);
}
