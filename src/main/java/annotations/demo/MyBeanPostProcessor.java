package annotations.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: GH
 * @Date: 2019/4/3 22:58
 * @Version 1.0
 *
 * BeanPostProcessor
 * 对象初始化前后调用
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * 对象初始化之前调用
     * @param bean     对象
     * @param beanName 对象名
     * @return
     * @throws BeansException
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..初始化前..bean:" + bean + "...beanName:" + beanName);
        return bean;
    }

    /**
     * 对象初始化之后调用
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..初始化后..bean:" + bean + "...beanName:" + beanName);
        return bean;
    }
}
