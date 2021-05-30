package com.wangwei.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wangwei
 * @Date 2021/5/31 4:23 上午
 * @Version 1.0
 */
@RestController
public class TestController {

    public String hello() {
        Page<Object> page = PageHelper.startPage(0, 1, "id desc");
        PageInfo<Object> objectPageInfo = new PageInfo<>(page);
        return null;
    }
}
