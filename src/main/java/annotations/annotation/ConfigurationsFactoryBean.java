package annotations.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: GH
 * @Date: 2019/4/1 23:14
 * @Version 1.0
 */
@Configuration
public class ConfigurationsFactoryBean {

    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }


}
