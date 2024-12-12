package org.example.spsapi.data.dao.impl;
import org.example.spsapi.data.dao.UserDao;
import org.example.spsapi.data.entity.T_userEntity;
import org.example.spsapi.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UserDaoImpl implements UserDao {
    UserRepository userRepository;
    @Autowired //자동으로 연결시켜준다 의미 (new 객체를 선언을 대신해준다)
    public  UserDaoImpl(UserRepository userRepository) { this.userRepository = userRepository;}

    @Override
    public T_userEntity  getUserInfo(String user_key){
        T_userEntity tUserEntity ;
        tUserEntity = userRepository.getReferenceById(user_key);
        return tUserEntity;
    }


}
