package annotations.model;

/**
 * @Author: GH
 * @Date: 2019/3/31 15:22
 * @Version 1.0
 */
public class Student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public void init(){
        System.out.println("我爱你 honey!");
    }

    public void destroy(){
        System.out.println("爱你到永远!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
