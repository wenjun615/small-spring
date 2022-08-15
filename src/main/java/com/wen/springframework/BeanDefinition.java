package com.wen.springframework;

/**
 * <p>
 * Bean 定义信息
 * </p>
 *
 * @author wenjun
 * @since 2022-08-15
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
