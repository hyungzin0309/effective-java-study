### 스레드 풀의 유형

1. Fixed Thread Pool <br> 고정된 수의 스레드를 유지한다. 생성 시 지정된 스레드 수가 변경되지 않는다.

2. Cached Thread Pool <br> 필요에 따라 스레드를 생성하고, 사용하지 않는 스레드는 일정 시간 후에 제거한다. 스레드 수에 제한이 없어 매우 유동적이다.

3. Scheduled Thread Pool <br> 일정 시간 후에 또는 주기적으로 작업을 실행하기 위한 스레드를 관리한다.

4. Single Thread Executor <br> 단일 스레드만을 사용하여 작업을 순차적으로 처리한다.

### Spring Boot의 Tomcat에서 사용하는 스레드 풀

Spring Boot에서 내장된 Tomcat 서버는 일반적으로 자체 스레드 풀을 사용한다. 이 스레드 풀은 Fixed Thread Pool과 유사한 동작을 한다.<br> 스레드 풀의 크기는
server.tomcat.max-threads 속성을 통해 설정할 수 있으며, 이 값은 애플리케이션의 요구 사항과 리소스에 따라 조정될 수 있다. 이 스레드 풀은 HTTP 요청을 처리하기 위해 사용되며, 각 요청은
별도의 스레드에서 처리된다.

Spring Boot와 Tomcat의 조합은 고정된 수의 스레드를 사용하여 다수의 동시 요청을 효율적으로 처리할 수 있는 구조를 제공한다. 이를 통해 웹 애플리케이션의 성능과 확장성을 개선할 수 있다.