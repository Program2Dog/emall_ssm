package cn.cdzy.emall.controller;

import cn.cdzy.emall.pojo.Admin;
import cn.cdzy.emall.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName : AdminController  //类名
 * @Description :   //描述
 * @Author : Program_Dog  //作者
 * @Date: 2020-10-12 10:18  //时间
 */
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/findAll")
    @ResponseBody
    public List<Admin> findAll(){
        return adminService.findAll();
    };
}
