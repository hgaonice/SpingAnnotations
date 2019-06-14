package annotations.annotation;

import annotations.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: GH
 * @Date: 2019/3/31 20:59
 * @Version 1.0
 */

@Configuration
public class ConfigurationConditional {
    @Bean
    public Student student(){
        return new Student("筱红", 20);
    }


    @Conditional(value = WinCondition.class)
    @Bean
    public Student bill(){
        return new Student("bill", 60);
    }


    @Conditional(value = LinuxCondition.class)
    @Bean
    public Student linus(){
        return new Student("linus", 45);
    }
}
