package annotations.test;

import annotations.annotation.ConfigurationScope;
import annotations.model.Student;
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

public class ScopeTest {
    @Test
    public void testScope() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationScope.class);
       /* String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }*/

        Student student = (Student) applicationContext.getBean("student");
        Student student1 = (Student) applicationContext.getBean("student");
        System.out.println(student==student1);
    }
}
