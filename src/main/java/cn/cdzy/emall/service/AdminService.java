package cn.cdzy.emall.service;

import cn.cdzy.emall.pojo.Admin;

import java.util.List;

public interface AdminService {

    /**
     * @Author Program_Dog
     * @Date 2020/10/12 10:06
     * @param
     * @return java.util.List<cn.cdzy.emall.pojo.Admin>
     * @Description 查询所有管理员账户 //TODO
     **/
    List<Admin> findAll();
}
