package annotations.annotation;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Author: GH
 * @Date: 2019/3/31 18:05
 * @Version 1.0
 *
 * 扫描自定义过滤规则
 */
public class MyTypeFilter implements TypeFilter {
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //当前类注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //当前扫描类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //资源路径
        Resource resource = metadataReader.getResource();
        //类的完整路径
        String className = classMetadata.getClassName();
        System.out.println("类的完整路径:" + className);

//        System.out.println("MyTypeFilter:"+className);
        String flig = "Student";
        if (className.contains(flig)) {
            return true;
        }
        return false;
    }
}
