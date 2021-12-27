package com.cola.dao;

import com.cola.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Bigoted waste
 * @Date 2021/12/27 下午4:19
 * @Version 1.0
 */

public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);

}
