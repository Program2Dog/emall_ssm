package cn.cdzy.emall.mapper;

import cn.cdzy.emall.pojo.Admin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName : adminMapper  //类名
 * @Description : 管理员mapper  //描述
 * @Author : Program_Dog  //作者
 * @Date: 2020-10-12 09:49  //时间
 */
public interface AdminMapper {

    /**
     * @param
     * @return java.util.List<cn.cdzy.emall.pojo.admin>
     * @Author Program_Dog
     * @Date 2020/10/12 9:51
     * @Description 查询所有管理员账户 //TODO
     **/
//    @Select("select * from admins")
    List<Admin> findAll();
}
