package annotations.annotation;

import annotations.model.Blue;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: GH
 * @Date: 2019/4/1 22:47
 * @Version 1.0
 *
 * 自定义注入
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean color = registry.containsBeanDefinition("annotations.model.Color");
        boolean red = registry.containsBeanDefinition("annotations.model.Red");
        if (color && red) {
            //如果容器中存在 color red这两个对象 就注入Blue
            registry.registerBeanDefinition("Blue",new RootBeanDefinition(Blue.class));
        }
    }
}
