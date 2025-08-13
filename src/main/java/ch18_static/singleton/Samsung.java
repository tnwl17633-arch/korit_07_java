package ch18_static.singleton;

import ch18_static.singleton.Products.ProductView;
import lombok.Getter;

/*
    방금 작성한 ProductView와 인터넷에서의 레퍼런스를 참조하여
    Samsung 클래스의 싱클톤 패턴을 작성하시오.
 */
public class Samsung {
    // 정적 필드
    private static Samsung instance;
    //일반 필드(멤버 변수라는 표현을 쓰기도 함)
    @Getter         // getCompany()만 만들겠다는 의미
    private static String company;
    private static int serialNumber;

    // private으로 NoArgsConstructor 정의
    {
        Class<Object> getClass;
        company = getClass.getSimpleName();   //어차피 이거 결과값 Samsung입니다.
        serialNumber = 20250000;            // 즉 객체 생성시에 필드값을 초기화시켰습니다.
    }

    public static Samsung getInstance() {
        return null;
    }

    public String createSerialNumber(String model) {
    }
}
