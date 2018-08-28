package com.webapp.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(T key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);

}
