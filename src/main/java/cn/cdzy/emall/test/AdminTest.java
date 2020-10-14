package cn.cdzy.emall.test;

import cn.cdzy.emall.mapper.AdminMapper;
import cn.cdzy.emall.pojo.Admin;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * @ClassName : AdminTest  //类名
 * @Description : 测试  //描述
 * @Author : Program_Dog  //作者
 * @Date: 2020-10-12 10:53  //时间
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc.xml"})
public class AdminTest {

    @Autowired
    WebApplicationContext context;

    MockMvc mockMvc;

    @Before
    public void initMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void test1() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/findAll")).andReturn();
//        MockHttpServletRequest request = result.getRequest();
//        System.out.println(request.getParameterNames());
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
