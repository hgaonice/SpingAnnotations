package annotations.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: GH
 * @Date: 2019/4/1 22:42
 * @Version 1.0
 * 选择注入
 */
public class MyImportSelector implements ImportSelector {
    /**
     * 返回注入类的完整路径
     * @param importingClassMetadata
     * @return
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        String[] interfaceNames = importingClassMetadata.getInterfaceNames();
        for (String interfaceName : interfaceNames) {
            System.out.println("interfaceName:" + interfaceName);
        }
        return new String[]{"annotations.model.Red","annotations.model.Yellow"};
    }
}
