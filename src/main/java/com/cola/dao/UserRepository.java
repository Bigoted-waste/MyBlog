package com.cola.dao;

import com.cola.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Bigoted waste
 * @Date 2021/12/15 上午9:55
 * @Version 1.0
 */

public interface UserRepository extends JpaRepository<User,Long> {

    User findAllByUsernameAndPassword(String username,String password);
}
