package com.cola.web;

import com.cola.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author Bigoted waste
 * @Date 2021/12/14 下午3:26
 * @Version 1.0
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){

        // 1.运行时异常
//        int i = 9 / 0;

        // 2.自定义异常
//        String blog = null;
//        if (blog == null) {
//            throw new NotFoundException("博客不存在");
//        }

        System.out.println("--------index-------------");

        return "index";
    }

}
