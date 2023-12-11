### 불필요한 객체 생성을 피하라

1. new String("") 으로 String 타입 생성하면, pool 에 캐싱된 문자열 사용하지 않는다.
    1. String str = "hello"; 와 같은 방식으로 문자열 할당
2. 숫자 연산 시에는 primitive 타입으로 연산하라
    1. refer 타입으로 연산 시 연산마다 새로운 객체를 생성하기 때문
3. 자주 사용되는 정규표현식 패턴은 캐싱하여 사용
    1. 패턴마다 컴파일하여 사용하는데, 컴파일하는 것 자체가 비용이 많이 들기 때문

### java 에서 정규표현식이 사용되는 부분

1. String 의 split
    1. 패턴이 한 글자인 경우엔 내부적으로 빠르게 처리하는 로직을 사용하므로, 한 글자인 경우는 캐싱하지 않아도 된다.
2. String 의 matches
3. String 의 replaceAll
4. String 의 replaceFirst
