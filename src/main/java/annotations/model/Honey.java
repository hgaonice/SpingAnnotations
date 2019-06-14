package annotations.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: GH
 * @Date: 2019/4/1 23:51
 * @Version 1.0
 *
 * 通过注解来构造 和销毁
 */
public class Honey {
    public Honey() {
        System.out.println("北鼻...Honey..");
    }

    @PostConstruct
    public void init(){
        System.out.println("北鼻...init..");
    }
    @PreDestroy
    public void destory(){
        System.out.println("北鼻...destory..");
    }
}
