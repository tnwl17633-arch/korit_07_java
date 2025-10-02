package WhileTest01;

public class DivisionCalculator {
    public static void divide(int a) {
        int b;
        System.out.println("나눗셈 결과: ");
    }

    public static void main(String[] args) {
        // TODO: try-catch-finally 블록을 사용하여 10을 0으로 나누는 코드를 작성하고 예외를 처리하시오.
        try {
            divide(10 % 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("계산을 종료합니다.");
        }
    }
}
        // divide(10, 0)을 호출해야 합니다.
/*
         try {
            login(inputId, inputPassword);
        } catch (LoginFailedException e) {    // 자동완성으로 사용자 정의 Exception 클래스가 나왔는데
            //그 근거는 login() 메서드 다음에 throws LoginFailedException을 작성했기 때문입니다.
            System.out.println("로그인 실패 : " + e.getMessage());
            // 이상을 실행했을 때 e.getMessage()의
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
* */
