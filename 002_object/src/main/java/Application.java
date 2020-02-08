import model.Student;
import model.Teacher;

public class Application {

    public static void main(String[] args) {
        Student stu1 = new Student("李莉", 20, "女");

        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.sex);
        stu1.study();
        stu1.rest();

        Teacher teacher1 = new Teacher("张龙");
        teacher1.addStudent("赵毅", 22, "男");
        teacher1.checkStudent();
    }
}