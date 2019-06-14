package annotations.annotation;

import annotations.model.Black;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: GH
 * @Date: 2019/4/1 23:11
 * @Version 1.0
 * MyImportBeanDefinitionRegistrar
 * FactoryBean工厂
 */
public class MyFactoryBean implements FactoryBean<Black> {

    public Black getObject() throws Exception {
        return new Black();
    }

    public Class<?> getObjectType() {
        return Black.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
