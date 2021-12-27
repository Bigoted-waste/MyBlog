package com.cola.service;

import com.cola.po.User;

/**
 * @Author Bigoted waste
 * @Date 2021/12/15 上午9:53
 * @Version 1.0
 */

public interface UserService {

    User checkUser(String username,String password);
}
