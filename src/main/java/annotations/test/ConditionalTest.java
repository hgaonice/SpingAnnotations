package annotations.test;

import annotations.annotation.ConfigurationConditional;
import annotations.annotation.ConfigurationScope;
import annotations.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @Author: GH
 * @Date: 2019/3/31 15:22
 * @Version 1.0
 * -Dos.name=linux
 *
 */

public class ConditionalTest {
    @Test
    public void testConditional() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationConditional.class);

        Map<String, Student> beansOfType = applicationContext.getBeansOfType(Student.class);

        System.out.println(beansOfType);

    }
}
