package annotations.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: GH
 * @Date: 2019/4/1 23:41
 * @Version 1.0
 */
public class Car implements InitializingBean, DisposableBean {

    public Car() {
        System.out.println("创建Car....");
    }

    public void destroy() throws Exception {
        System.out.println("销毁Car...destroy...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化.....Car...afterPropertiesSet..");
    }
}
