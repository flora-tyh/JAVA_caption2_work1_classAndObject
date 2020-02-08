package model;

public class Student {
    String name;
    int age;
    String sex;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void study() {
        System.out.println("开始学习！");
    }

    public void rest() {
        System.out.println("开始休息！");
    }
}

