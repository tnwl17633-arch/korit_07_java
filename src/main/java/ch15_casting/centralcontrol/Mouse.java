package ch15_casting.centralcontrol;

public class Mouse implements Power{
    @Override
    public void on() {
        System.out.println("마우스의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("마우스의 전원을 끕니다.");
    }

    public void leftClick() {
        System.out.println("마우스 왼쪽 클릭");
    }
}
