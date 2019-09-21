package cn.griouges.learn.design.jdbc.model;

/**
 * @author Liar
 */
public class User {
    private String name;
    private Integer age;
    
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}