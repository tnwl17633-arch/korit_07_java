package testpackage;

import java.sql.SQLOutput;

class Member {
    public String setName;
    private String name;
    private int age;

    public Member(String name) {
        this.name = name;
    }

    // TODO: name에 대한 Getter와 Setter를 작성하시오.
    // Setter에는 이름이 null이 아니고 2글자 이상인지 검증하는 로직을 추가하시오.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name.length() >= 2){
            this.name = name;
        } else {
            System.out.println("유효하지 않은 이름입니다.");
        }
    }

    // TODO: age에 대한 Getter와 Setter를 작성하시오.
    // Setter에는 나이가 0에서 120 사이인지 검증하는 로직을 추가하시오.

    public int getAge() {
        return age;
    }

    public boolean setAge() {
        if (0 < age && age < 120) {
            this.age = age;
        } else {
            System.out.println("유효하지 않은 나이입니다.");
        }
        return false;
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

public class MemberManagement {
    public static void main(String[] args) {
        Member member1 = new Member("이순신");
        Member member2 = new Member("김");
        Member member3 = new Member("강감찬");

        member1.setName = "이순신";
        member2.setName = "김";
        member3.setName = "강감찬";

        member1.setAge();
        member2.setAge();
        member3.setAge();

        System.out.println(member1.getName());
        System.out.println(member2.getName());
        System.out.println(member3.getName());
        System.out.println(member1.setAge());
        System.out.println(member2.setAge());
        System.out.println(member3.setAge());

        // TODO: 유효한 이름("이순신")과 유효하지 않은 나이(150)를 설정하고 정보를 출력하시오.
        // TODO: 유효하지 않은 이름("김")과 유효한 나이(30)를 설정하고 정보를 출력하시오.
        // TODO: 유효한 이름("강감찬")과 유효한 나이(45)를 설정하고 정보를 출력하시오.
    }
}