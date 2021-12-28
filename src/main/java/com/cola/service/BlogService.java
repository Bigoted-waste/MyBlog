package com.cola.service;

import com.cola.po.Blog;
import com.cola.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Author Bigoted waste
 * @Date 2021/12/27 下午5:41
 * @Version 1.0
 */

public interface BlogService {

    Blog getBlog(Long id);

    //查询一组数据
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id,Blog blog);

    void deleteBlog(Long id);
}
