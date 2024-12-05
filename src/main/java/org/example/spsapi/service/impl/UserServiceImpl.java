package org.example.spsapi.service.impl;
import org.example.spsapi.data.dao.UserDao;
import org.example.spsapi.data.dao.impl.UserDaoImpl;
import org.example.spsapi.data.dto.UserDto;
import org.example.spsapi.data.entity.T_userEntity;
import org.example.spsapi.data.handler.UserDataHandler;
import org.example.spsapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    UserDataHandler userDataHandler;
    @Autowired
    public   UserServiceImpl(UserDataHandler userDataHandler) {
        this.userDataHandler = userDataHandler;
    }
    @Override
    public UserDao getUserInfo(Long user_key){
        Userinfo userinfo = userDataHandler.getT_userEntity(user_key);
        UserDto = new UserDto( userinfo.) {
            @Override
            public T_userEntity getUserInfo(Integer user_key) {
                return null;
            }
        };

        @Override
        public ProductDto getProduct(String productId){

            Product product = productDataHandler.getProductEntity(productId);

            ProductDto productDto = new ProductDto(product.getId(), product.getName(), product.getPrice(), product.getStock());

            return productDto;
        }


}
