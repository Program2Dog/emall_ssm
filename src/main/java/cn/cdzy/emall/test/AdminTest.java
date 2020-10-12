package cn.cdzy.emall.test;

import cn.cdzy.emall.mapper.AdminMapper;
import cn.cdzy.emall.pojo.Admin;
import cn.cdzy.emall.service.AdminService;
import cn.cdzy.emall.service.Impl.AdminServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName : AdminTest  //类名
 * @Description : 测试  //描述
 * @Author : Program_Dog  //作者
 * @Date: 2020-10-12 10:53  //时间
 */

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext.xml")  // 加载配置文件
public class AdminTest {
//    @Resource(name = "adminService")
//    AdminService adminService;
//    @Autowired
//    AdminMapper adminMapper;

    @Test
    public void tets1() {
//        List<Admin> admins = adminMapper.findAll();
//        for (Admin admin : admins) {
//            System.out.println(admin);
//        }
    }

    @Test
    public void test2(){
//		导入Spring核心配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		获取bean
		AdminMapper adminMapper = applicationContext.getBean(AdminMapper.class);
//		执行查询
        List<Admin> admins = adminMapper.findAll();
//		输出结果
        System.out.println(admins);

    }
}
