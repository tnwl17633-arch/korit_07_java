package WhileTest01;//package WhileTest01;
//
//import java.util.Scanner;
//
//public class whileTest02 {
//    public static void main(String[] args) {
//        int target = (int)(Math.random()* 50) +1;
//        Scanner scan = new Scanner(System.in);
//        int user = 0;
//        int count = 1;
//
//        while(target != user) {
//            System.out.println("숫자를 입력: ");
//            user = scan.nextInt();
//
//            if(target > user) {
//                System.out.println("업!!");
//            }else if(target < user) {
//                System.out.println("다운!!");
//            }else {
//                System.out.println("정답! 값은 " + target + "입니다");
//                System.out.println(count + " 만에 맞혔습니다!");
//            }
//            count++;
//        }
//        scan.close();
//    }
//}


//import java.util.*;
//
//public class GradeCalculator {
//
//    public static double calculateAverage(Map<String, Integer> scores) {
//        double sum = 0;
//        // TODO: scores 맵의 모든 점수를 합산하여 합계를 구하는 코드를 작성하시오.
////
////        // TODO: 합산된 점수를 과목 수로 나누어 평균을 계산하고 반환하는 코드를 작성하시오.
////        // 단, 과목이 없을 경우 0점을 반환해야 합니다.
////        return 0.0;
////    }
////
////    public static void main(String[] args) {
////        List<Map<String, Object>> students = new ArrayList<>();
////
////        Map<String, Object> student1 = new HashMap<>();
////        student1.put("name", "홍길동");
////        Map<String, Integer> scores1 = new HashMap<>();
////        scores1.put("국어", 85);
////        scores1.put("영어", 90);
////        scores1.put("수학", 95);
////        student1.put("scores", scores1);
////        students.add(student1);
////
////        Map<String, Object> student2 = new HashMap<>();
////        student2.put("name", "김철수");
////        Map<String, Integer> scores2 = new HashMap<>();
////        scores2.put("국어", 75);
////        scores2.put("영어", 80);
////        scores2.put("과학", 88);
////        student2.put("scores", scores2);
////        students.add(student2);
////
////        // TODO: students 리스트를 순회하며 각 학생의 이름과 평균 점수를 출력하시오.
////        // calculateAverage 메서드를 반드시 사용해야 합니다.
////    }
////}
////import java.util.*;
////
////public class StudentScores {
////    public static void main(String[] args) {
////
////        List<Map<String, Object>> students = new ArrayList<>();
////
////
////        Map<String, Object> student1 = new HashMap<>();
////        student1.put("name", "Alice");
////        student1.put("scores", Arrays.asList(85, 90, 78));
////        students.add(student1);
////
////        Map<String, Object> student2 = new HashMap<>();
////        student2.put("name", "Bob");
////        student2.put("scores", Arrays.asList(92, 88, 95));
////        students.add(student2);
////
////        Map<String, Object> student3 = new HashMap<>();
////        student3.put("name", "Charlie");
////        student3.put("scores", Arrays.asList(70, 75, 80));
////        students.add(student3);
////
////        for (Map<String, Object> student : students) {
////            String name = (String) student.get("name");
////            List<Integer> scores = (List<Integer>) student.get("scores");
////
////            double average = scores.stream().mapToInt(Integer::intValue).average().orElse(0.0);
////
////            System.out.printf("학생: %s, 평균 점수: %.2f\n", name, average);
////        }
////    }
////}
////
//
////public class Simulator {
////    public static void main(String[] args) {
////    }
////    public static <VendingMachine> void  selectDrink(String[] args) {
////        VendingMachine vendingMachine = new VendingMachine();
////
////        Scanner scanner = new Scanner(System.in);
////        int choice;
////        switch (choice) {
////                case 1000:
////                    System.out.println("콜라");
////                    break;
////                case 1200:
////                    System.out.println("사이다");
////                    break;
////                case 800:
////                    System.out.println("물");
////                    break;
////                default:
////                    System.out.println("default");
////            }
////            choice = scanner.nextInt();
////
////            scanner.close();
////
////            System.out.println("---자판기---");
////            System.out.println("1. 콜라 | 2. 사이다 | 3. 물");
////            System.out.print("음료 번호를 선택하세요: ");
////        }
////
////        System.out.printf("잘못된 번호입니다.");
////    }
//
//import lombok.Builder;
//import lombok.ToString;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public static class ScoreAnalyzer {
//    public static int main(String[] args) {
//        int countPassingStudents;
//        int[] scores, int passingScore, int passingStudentsCount;
//        {
//            passingStudentsCount = 0;
//            for (int i = 0; i <= 10; i++) {
//                int passingScore1 = passingScore;
//                int passingScore2 = passingScore;
//                if ( int i <= passingScore);
//                System.out.println(passingStudentsCount);
//                break;
//            }
//
//        }
//        // TODO: for문을 사용하여 scores 배열을 순회하고,
//        // if문을 사용하여 passingScore 이상인 학생 수를 세는 코드를 작성하시오.
//
//        return passingStudentsCount;
//    }
//}
//    public static void main(String[] args) {
//        ScoreAnalyzer analyzer = new ScoreAnalyzer();
//        int[] scores = {88, 95, 72, 68, 77, 91, 60};
//        int passingScore = 75;
//        printcountPassingStudents();
//        System.out.println("75점 이상으로 통과한 학생은" + countPassingStudents() + "명 입니다.");
//        // TODO: countPassingStudents 메서드를 호출하고 결과를 출력하시오.
//    }
//
//private static String countPassingStudents() {
//}
//
//private static void printcountPassingStudents() {
//}
//
//public abstract class Animal {
//    public abstract void sound();
//    public abstract void eat();
//    public void walk() {
//        System.out.println("걷는다.");
//    }
//}
//// TODO: calculateArea() 추상 메서드를 가진 Shape 추상 클래스를 작성하시오.
//public abstract class Shape {
//    public abstract void calculateArea(); }
//// TODO: Shape을 상속받고, 반지름(radius)을 필드로 가지는 Circle 클래스를 작성하시오.
//// calculateArea() 메서드를 오버라이딩하여 원의 넓이를 계산하시오. (원주율 = 3.14)
//public class Circle extends Shape {
//    int radius;
//
//    @Override
//    public void calculateArea() {
//
//    }
//}
//
//// TODO: Shape을 상속받고, 가로(width)와 세로(height)를 필드로 가지는 Rectangle 클래스를 작성하시오.
//// calculateArea() 메서드를 오버라이딩하여 사각형의 넓이를 계산하시오.
//
//
//public class AreaCalculator {
//    public static void main(String[] args) {
//        // TODO: 반지름이 10인 원(Circle) 객체를 생성하고 넓이를 출력하시오.
//        // TODO: 가로가 5, 세로가 8인 사각형(Rectangle) 객체를 생성하고 넓이를 출력하시오.
//    }
//}
//
//@Override
//public String toString() {
//    return super.toString();
//}
//
//// TODO: send(String message) 추상 메서드를 가진 Notification 인터페이스를 작성하시오.
//public static interface Notification;
//
//public void send(String message) {
//
//}
//
//// TODO: Notification 인터페이스를 구현하는 EmailNotification 클래스를 작성하시오.
//// send 메서드는 "이메일 발송: [메시지]" 형식으로 출력합니다.
//public static class EmailNotification;
//    public Notification;
//    System.out.void println("이메일 발송: + EmailNotification + ")
//// TODO: Notification 인터페이스를 구현하는 SmsNotification 클래스를 작성하시오.
//// send 메서드는 "SMS 발송: [메시지]" 형식으로 출력합니다.
//
//public class Notifier {
//    public static <SmsNotification> void main(String[] args) {
//        // TODO: EmailNotification 객체를 생성하고 "주문이 완료되었습니다." 메시지를 보내시오.
//        // TODO: SmsNotification 객체를 생성하고 "배송이 시작되었습니다." 메시지를 보내시오.
//    EmailNotification emailNotification = new EmailNotification();
//        System.out.println("주문이 완료되었습니다.");
//        SmsNotification smsNotification = new SmsNotification();
//        System.out.println("배송이 시작되었습니다.");
//    }
//}
//
//import class lombok.Builder;
//import class lombok.ToString;
//
//// TODO: Lombok의 @Builder와 @ToString 애너테이션을 추가하시오.
//@ToString
//@Builder
//class User {
//    private String username;
//    private String email;
//    private int age;
//}
//
//public class UserFactory {
//    public static void main(String[] args) {
//        // TODO: 빌더 패턴을 사용하여 username="user1", email="user1@example.com", age=25 인 User 객체를 생성하고 출력하시오.
//    User user1 = User.builder()
//            .username("user1")
//            .email("user@example.com")
//            .age(25)
//            .build();
//        System.out.println(user1);
//        // TODO: 빌더 패턴을 사용하여 username="user2", email="user2@example.com" 인 User 객체를 생성하고 출력하시오.
//    User user2 = User.builder()
//            .username("user2")
//            .email("user2@example.com")
//            .build();
//
//    }
//}
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ShoppingCart {
//    public static void main(String[] args) {
//        List<String> cart = new ArrayList<>();
//
//        // TODO: cart에 "사과", "우유", "빵"을 추가하시오.
//        cart.add(new ArrayList<>("사과");
//        cart.add(new ArrayList<>("우유");
//        cart.add(new ArrayList<>("빵");
//
//        // TODO: cart에서 "우유"를 삭제하시오.
//        cart.remove("우유");
//        // TODO: cart의 첫 번째 항목을 조회하여 "첫 번째 상품: [상품명]" 형식으로 출력하시오.
//        cart.get(1);
//        cart.set(1,"첫 번째 상품: [상품명]");
//        // TODO: 최종 장바구니 목록을 "최종 목록: [리스트]" 형식으로 출력하시오.
//        System.out.println("최종 목록: [리스트]");
//    }
//}
//
