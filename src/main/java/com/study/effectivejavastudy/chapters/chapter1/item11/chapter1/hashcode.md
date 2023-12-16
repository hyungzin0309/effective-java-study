## hashcode 오버라이딩 이유

equals 를 오버라이딩할 때 hashcode 를 반드시 같이 오버라이딩하는 이유는, hash 자료구조내에서 객체끼리의 비교 시 hashcode 가 사용되기 때문이다.

예로, hashmap 에서는, 객체의 hashcode 값과 버킷의 수를 나눈 나머지 번째의 버킷에 해당 인스턴스를 저장하게 된다.

### hashcode 규약

1. equals 구현이 변경되지 않은 경우 hashcode 의 리턴값은 항상 같아야 함.
    1. 단, equals 를 오버라이딩하지 않은 경우 hashcode 는 인스턴스의 주소값을 기반하여 만들어지므로, 어플리케이션을 내렸다 올린 경우 달라질 수 있음.
2. equals 에서 비교에 사용되는 프로퍼티를 이용하여 hashcode 를 생성해야 한다.
    1. 그래야 equals 가 true 인 인스턴스끼리 같은 hashcode 를 생성하기 떄문이다.
3. equals 가 false 인 인스턴스끼리는 되도록 다른 hashcode 값을 갖도록 한다.
    1. hashMap 은 hashcode 를 기반한 계산으로 버킷을 결정하여 인스턴스를 저장하는데, 해시코드값이 겹치는 경우 한 버킷 안에 리스트 형태로 저장된다.
       <br> 겹치는 해시코드가 계속 발생할 경우 조회성능이 O(1)에서 조금씩 감소함

### hashcode overriding 예 - HashcodeOverridingClass#hashCode

1. 31인 이유 : 홀수이자 해시충돌이 가장 적은 소수