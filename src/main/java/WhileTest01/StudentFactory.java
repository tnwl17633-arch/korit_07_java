package WhileTest01;

class Student {
    int studentId;
    String name;

    // TODO: 기본 생성자를 작성하시오. (studentId: -1, name: "미정")

    public Student() {
    }

    // TODO: 학번(studentId)만 받는 생성자를 작성하시오. (name: "미정")

    public Student(int studentId) {
        this.studentId = studentId;
    }

    // TODO: 학번(studentId)과 이름(name)을 모두 받는 생성자를 작성하시오.

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("학번: " + studentId + ", 이름: " + name);
    }
}

public class StudentFactory {
    public static void main(String[] args) {
        // TODO: 세 가지 생성자를 각각 사용하여 Student 객체를 생성하고 printInfo()를 호출하시오.
        Student student = new Student();
        student.studentId = -1;
        student.name = "미정";
        student.printInfo();

        Student student1 = new Student(2025001);
        student1.name = "미정";
        student1.printInfo();

        Student student2 = new Student(2025002, "홍길동");
        student2.printInfo();
    }
}