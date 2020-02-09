package model;

public class Teacher {
    private String name;
    private Student[] students = new Student[1];

    public Teacher() {
    }

    public Teacher(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void checkStudent() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName());
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
