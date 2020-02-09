import model.Student;
import model.Teacher;

public class Application {

    public static void main(String[] args) {
        Student stu1 = new Student("李莉", 20, "女");
        Student stu2 = new Student("王其", 21, "男");
        Student[] students = new Student[1];
        students[0] = stu1;
        students[1] = stu2;

        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getSex());
        stu1.study();
        stu1.rest();

        Teacher teacher1 = new Teacher("张龙", students);
        teacher1.addStudent("赵毅", 22, "男");
        teacher1.checkStudent();
    }
}