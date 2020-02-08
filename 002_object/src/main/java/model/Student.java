package model;

public class Student {
    public String name;
    public int age;
    public String sex;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void study() {
        System.out.println("开始学习！");
    }

    public void rest() {
        System.out.println("开始休息！");
    }
}

