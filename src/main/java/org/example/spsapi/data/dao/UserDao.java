package org.example.spsapi.data.dao;

import org.example.spsapi.data.entity.T_userEntity;

public interface UserDao  {
    T_userEntity getUserInfo(Integer user_key);
}
