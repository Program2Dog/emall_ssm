package cn.cdzy.emall.service;

import cn.cdzy.emall.mapper.AdminMapper;
import cn.cdzy.emall.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : AdminServiceImpl  //类名
 * @Description : 管理员Service实现  //描述
 * @Author : Program_Dog  //作者
 * @Date: 2020-10-12 10:08  //时间
 */

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }
}
