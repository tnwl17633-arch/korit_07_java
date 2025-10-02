package WhileTest01;

public class LambdaThread {
    public static void main(String[] args) {
        // TODO: "새로운 스레드에서 실행 중..."을 출력하는 Runnable을 람다식으로 작성하시오.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("새로운 스레드에서 실행 중...");
            }
        };
        /*
        runnable.run(); // 이상의 방법은 메서드명이 명시되니까 편한데,

        Runnable lambdaRunnable = () -> System.out.println("Hello, Lambda!");
        lambdaRunnable.run();
         */
        // TODO: 위에서 작성한 Runnable을 사용하여 Thread 객체를 생성하고 시작(start)하시오.
        Thread lambdaRunnable = new Thread(runnable);
        lambdaRunnable.start();
        System.out.println("메인 스레드 종료.");
    }
}
