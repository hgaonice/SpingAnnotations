package annotations.annotation;

import annotations.demo.MyBeanPostProcessor;
import annotations.model.Car;
import annotations.model.Honey;
import annotations.model.Student;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.*;

/**
 * @Author: GH
 * @Date: 2019/3/31 15:39
 * @Version 1.0
 *
 * @Repeatable 重复主键
 * @ComponentScan 包扫描
 * includeFilters  导入要扫描  @ComponentScan.Filter  FilterType.ANNOTATION 注解
 * classes制定扫描的注解 useDefaultFilters = false 关闭默认的方式
 *FilterType {
 *     ANNOTATION,  按照注解
 *     ASSIGNABLE_TYPE,  按照指定类型
 *     ASPECTJ,
 *     REGEX, 正则
 *     CUSTOM;   自定义规则
 *     }
 */
@Configuration
@ComponentScan(value = "annotations",
        includeFilters ={
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = StudentDao.class)},
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)},
        useDefaultFilters = false)
@Import({Car.class, Honey.class, MyBeanPostProcessor.class})
public class Configurations  {

    /**
     * 多实例的Bean Spring容器是不进行管理的
     * @return
     */
    @Bean(initMethod ="init"  ,destroyMethod = "destroy")
    public Student student(){
        return new Student("筱红", 20);
    }
}
