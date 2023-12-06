### 직렬화, 역직렬화

1. static 필드는 메모리에 저장되는 값이므로 직렬화대상이 아니다.
2. 직렬화를 원치 않는 필드는 transient 키워드 사용
3. class 가 변경되어도 역직렬화할 수 있도록 하려면
    1. private static final long serialVersionUID 의 값을 정해주면 됨.
    2. 선언하지 않는 경우, class 변경이 감지되면 serialVersionUID 을 자동으로 바뀌며 이 때문에 역직렬화 불가