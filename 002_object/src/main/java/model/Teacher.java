package model;

public class Teacher {
    public String name;
    public Student[] students = new Student[1];
    public Student stu0 = new Student("李莉", 20, "女");
    public Student stu1 = new Student("王其", 21, "男");

    public Teacher(String name) {
        this.name = name;
    }

    public void checkStudent() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }
    }

    public void addStudent(String name, int age, String sex) {
        Student[] studentsAfterAdd = new Student[students.length + 1];
        System.arraycopy(students, 0, studentsAfterAdd, 0, students.length);
        Student newStu = new Student(name, age, sex);
        studentsAfterAdd[studentsAfterAdd.length - 1] = newStu;
        students = studentsAfterAdd;
    }
}
