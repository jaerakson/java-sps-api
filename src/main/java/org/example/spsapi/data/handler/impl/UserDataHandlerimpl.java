package org.example.spsapi.data.handler.impl;

import jakarta.transaction.Transactional;
import org.example.spsapi.data.dao.UserDao;
import org.example.spsapi.data.entity.T_userEntity;
import org.example.spsapi.data.handler.UserDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Transactional
@Repository
@Component
public class UserDataHandlerimpl implements UserDataHandler {
   UserDao userDao;
   @Autowired
    public   UserDataHandlerimpl(UserDao userDao) {
       this.userDao = userDao;
   }
    @Autowired
   public T_userEntity getT_userEntity(Long user_key) {
        return userDao.getUserInfo(user_key);
   }
}
