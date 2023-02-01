package com.pagehelper.controller;

import com.github.pagehelper.PageHelper;
import com.pagehelper.domain.User;
import com.pagehelper.other.TableDataInfo;
import com.pagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author smallmayi
 */
@RestController
public class UserController extends BaseController {
    @Autowired
    UserService userService;

    @GetMapping("/list")
    public TableDataInfo genList() {

        PageHelper.startPage(2, 3);
        List<User> list = userService.queryList();
        return getDataTable(list);
    }
}
