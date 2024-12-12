package org.example.spsapi.data.dao;

import org.example.spsapi.data.entity.T_userEntity;

public interface UserDao  {
    T_userEntity getUserInfo(String user_key);
}
