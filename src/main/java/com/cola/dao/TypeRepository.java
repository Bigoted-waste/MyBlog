package com.cola.dao;

import com.cola.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Bigoted waste
 * @Date 2021/12/15 上午11:09
 * @Version 1.0
 */

public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);
}
