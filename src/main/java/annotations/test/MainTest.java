package annotations.test;

import annotations.annotation.Configurations;
import annotations.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: GH
 * @Date: 2019/3/31 15:22
 * @Version 1.0
 */

public class MainTest {

    @Test
    public void xmlTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }

    @Test
    public void xmlTest01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    }

    /**
     * 注解
     */
    @Test
    public void xmlTest02() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configurations.class);
        annotations.model.Student bean = (Student) applicationContext.getBean("student");
        System.out.println(bean);
    }

    /**
     * ComponentScan包扫描
     */
    @Test
    public void testComponentScan() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configurations.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
