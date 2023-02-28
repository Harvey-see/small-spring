package cn.bugstack.springframework;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class BeanDefinition {

    private Object bean;
    //测试修改第9行
    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
