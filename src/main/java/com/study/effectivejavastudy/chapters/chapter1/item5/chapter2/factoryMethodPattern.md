### 팩토리 메서드 패턴의 필요성

특정 구현체의 생성이 복잡한 경우, 해당 구현체를 생성하는 팩토리를 구현하여 구현체 생성을 위임할 수 있다.

단, 구현체가 여러개가 될 수 있는 경우, 팩토리도 하나의 인터페이스 하위에 여러 타입의 팩토리를 구현할 수 있다. 