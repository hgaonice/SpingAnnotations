package annotations.test;

import annotations.annotation.ConfigurationImport;
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

public class ImportTest {
    @Test
    public void testImport() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationImport.class);

        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
