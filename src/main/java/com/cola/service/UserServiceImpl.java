package com.cola.service;

import com.cola.dao.UserRepository;
import com.cola.po.User;
import com.cola.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Bigoted waste
 * @Date 2021/12/15 上午9:54
 * @Version 1.0
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user=userRepository.findAllByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
