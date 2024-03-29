## 싱글톤 사용 시 주의점

### 순수 Java 를 이용한 싱글톤 구현의 문제점

1. 싱글톤을 사용하는 client 에 대한 테스트가 어렵다.
    1. **이유** : 싱글톤 객체는 상속이 불가하기 때문에, mock 객체를 만들 수 없음
    2. **해결책** : client 에서 싱글톤 객체에 직접 의존하지 않도록, 싱글톤 객체가 구현할 상위 interface 를 정의하고, 테스트 시 해당 interface 를 구현하는 mock 객체를
       사용한다. (그러나 이 역시, 테스트를 위해 interface 를 정의해야한다는 단점이 있음.)
2. reflection 을 이용하여 private 접근 제어자를 무시하고 새로운 인스턴스 생성 가능 (이렇게까지 사용할 일이 있곘나 싶긴 하지만,, 아무튼 단점임)
    1. **해결책** : 싱글톤 내 필드에 이미 인스턴스가 생성되었는지 확인하는 flag 필드를 두어, 이미 인스턴스가 생성된 경우 에러발생하도록 함.
3. 역직렬화 시, 새로운 인스턴스 생성
    1. **이유** : 역직렬화 시 생성된 인스턴스는 직렬화에 사용된 인스턴스와 서로 다른 메모리에 위치하게 된다. 싱글톤이라 하여 역직렬화 시 기존의 인스턴스를 사용하지는 않는다.
    2. **해결책** : 자바에서는 역직렬화 시 역직렬화가 완료된 후 readResolve 를 호출하여 최종적으로 반환할 인스턴스를 결정한다. readResolve 를 객체 내에 직접 선언(커스텀)해주면 자바는
       해당 메소드를 읽어들인다. 따라서 readResolve 를 정의하여 싱글톤 인스턴스를 리턴하도록 구현하면 된다.
    3. **추가** : readResolve 는 역직렬화 후 최종 반환할 객체를 정하는 메소드이고, readObject 는 역직렬화 중 인스턴스의 필드값을 주입하는 데에 사용된다. 