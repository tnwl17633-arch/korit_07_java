package ch19_generic.wildcard;

public class Main {
    // 메서드 정의 영역
    // 현재 AnimalData에서는 필드로 들어온 객체가 Animal 클래스의 서브 클래스인지
    // 아닌지를 구분할 수 없기 때문에
    // 이를 판단하는 메서드를 Main에 정의하도록 하겠습니다.
    public AnimalData<? extends Animal> getAnimal(int flag) {
        if (flag == 1) {
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
        return null;
    }


    public static void main(String[] args) {
        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
        /*
            현재 상황에서는 AnimalData에 Car 객체가 들어가있지만 오류가 발생하지 않습니다.
            Generic 개념 때문에, T에는 어떤 클래스도 들어갈 수 있기 때문입니다.
         */
        animalData1.showData();
        animalData2.showData();
 //       animalData3.showData();       // 오류 발생
        /*
            animalData3.showData()에서 오류가 발생함을 알 수 있습니다.
            AnimalData 클래스에서 정의된 메서드 로직을 확인해보시면
            필드를 (Animal)로 형변환시키는데, Car 클래스의 인스턴스를 Animal로
            형변환시키는 것이 불가능하기 때문입니다.

            즉 제네릭'만을' 사용했을 때 생길 수 있는 문제점입니다.
         */

        // .getAnimal() 메서드 호출할거라서 객체 생성하겠습니다.
        Main main = new Main();
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(3);

        /*
            .getAnimal()을 여러분이 정의하지 않았다고 가정한다면 현재 animalData4,5,6의
            필드에 어떤 클래스의 객체가 들어가있는지 모릅니다.
            근데 저희는 대충 아니까 animalData6의 필드에는 뭐가 들어가있어야 하나요?

         */
        if(animalData4 != null) {
            animalData4.showData();
        }
        if(animalData5 != null) {
            animalData5.showData();
        }
        if(animalData6 != null) {
            animalData6.showData();
        } else {                    // animalData6 == null 이라면
            System.out.println("아무것도 없습니다.");
        }
    }
}


//  특정 element lIST 내의 검색 -> contains() 메서드 사용 리스트명..contains(목적어)
//String searcheElem = "python";
//    boolean contains1 = strList.contains()
//SearchE1em1


// 결과값 : true
/* 이상의 이유는 LIST는 ELEMENT가 명후ㅘ

// 특정 element의 삭제 -> 리스트명.remove(특정eelement)
string removeELem1 = "Javascript;
boolean isRemoved = strLIST.remove(removeElem1);
System.out.println(removeElem1 + "삭제 여부" + isRemoved);
// 시험에 pop() 메서드가 나온 적 있어서 좀비교해야합니다.
/*FIFO / ,OIO9( -> 삭제 여부가 아니라 collection에서 삭제하고 삭제된 element를 return함.
System.out.println(strList);

// List의 역순 정렬
Collections.sort(strList, Comparator.reverseOrder());
System.out.println(strList);
 */

// 전체 element 들 출력 방법
// 1. 배열
// 일반 for문으로 출력하시오
//for( int i = 0; i < strArray.length ; i ++ ) {
//        System.out.println(strArray[i] + " ");
//}
//System.out.println();
//// 향상된 for문으로 출력하시오
//    for(String data : strArray) {
//        System.out.println(data + " ");
//}
//// 2. 리스트
//for( int i = 0 ; i < strList.size() ; i++ ) {
//        System.out.println(strList.get(i));}
//}
//System.out.println();
//// 향상된 for문
//for(String elem : strList ) {
//    s
//        }
//    int[] arr01 = { 1, 2, 3, 4, 5 };
//for()
