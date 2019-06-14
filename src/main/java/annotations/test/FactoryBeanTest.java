package annotations.test;

import annotations.annotation.ConfigurationImport;
import annotations.annotation.ConfigurationsFactoryBean;
import annotations.annotation.MyFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: GH
 * @Date: 2019/3/31 15:22
 * @Version 1.0
 * -Dos.name=linux
 *
 */

public class FactoryBeanTest {
    @Test
    public void testFactoryBean() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationsFactoryBean.class);

        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        MyFactoryBean bean = applicationContext.getBean(MyFactoryBean.class);
//        Object bean1 = applicationContext.getBean("&myFactoryBean");
        Object bean1 = applicationContext.getBean("&myFactoryBean");
        System.out.println(bean);
        System.out.println(bean1);

    }
}
