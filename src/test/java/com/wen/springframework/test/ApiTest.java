package com.wen.springframework.test;

import com.wen.springframework.BeanDefinition;
import com.wen.springframework.BeanFactory;
import com.wen.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * <p>
 * 测试
 * </p>
 *
 * @author wenjun
 * @since 2022-08-15
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
