package org.example.spsapi.service.impl;
import org.example.spsapi.data.dao.UserDao;
import org.example.spsapi.data.dto.UserDto;
import org.example.spsapi.data.handler.UserDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.spsapi.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    UserDataHandler userDataHandler; // 데이터 핸들링이 필요한경우 만듬


    @Autowired
    public   UserServiceImpl(UserDataHandler userDataHandler) {
        this.userDataHandler = userDataHandler;
    }

    @Override
    public UserDao getUserInfo(String user_key){
        UserInfo userinfo = userDataHandler.getT_userEntity(user_key);
        UserDto userDto = new UserDto(userinfo.getUser_key,userinfo.getNick_nm() );
        return userDto;
        };
}


