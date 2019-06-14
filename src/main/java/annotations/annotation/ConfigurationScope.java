package annotations.annotation;

import annotations.model.Student;
import org.springframework.context.annotation.*;

/**
 * @Author: GH
 * @Date: 2019/3/31 15:39
 * @Version 1.0
 * @Scope 调整作用域  prototype  多实例  singleton 单例
 *                    request 每次请求创建一个(WEB环境) session 同一个session创建一个环境
 *
 * @Lazy 懒加载  针对单实例对象的
 */
@Configuration
public class ConfigurationScope {

//    @Scope("prototype")
    @Lazy
    @Bean
    public Student student(){
        System.out.println("创建student对象");
        return new Student("筱红", 20);
    }
}
