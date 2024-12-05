package org.example.spsapi.data.dao.impl;

import org.example.spsapi.data.dao.UserDao;
import org.example.spsapi.data.entity.T_userEntity;
import org.example.spsapi.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
    UserRepository userRepository;
    @Autowired
    public void UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public T_userEntity getUserInfo (Long user_key){
        T_userEntity tUserEntity ;
        tUserEntity = userRepository.getReferenceById( user_key);
        return tUserEntity;
    }
}
