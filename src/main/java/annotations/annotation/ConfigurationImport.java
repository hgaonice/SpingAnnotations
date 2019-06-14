package annotations.annotation;

import annotations.model.Color;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: GH
 * @Date: 2019/4/1 22:12
 * @Version 1.0
 */
@Configuration
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class ConfigurationImport {

}
