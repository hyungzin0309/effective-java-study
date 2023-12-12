### try-with-resource 를 사용해야 하는 이유

1. finally 사용 시 close 를 개발자가 직접 명시해야 함 -> 까먹을 수 있음
    1. try-with-resource 사용 시 자동으로 close 호출 (Autoclosible 인터페이스)
2. 가독성 향상
    1. finally 구문 없이도 자원반납되기 때문
3. 에러로그를 먹지 않는다.
    1. finally 를 사용할 경우, 만약 try 문에서 A 에러가 발생한 뒤, finally 구문에서 B 에러가 발생하면 결과적으로 B 에러만 보여짐 <br> -> finally 에서 발생한 에러보다 try
       에서 발생한 에러가 더 중요한데, 이를 못보는 상황이 발생한다.
    2. try-with-resource 를 사용하면 try 부분에서 발생한 에러와 close 시 발생한 에러가 따로 보여짐