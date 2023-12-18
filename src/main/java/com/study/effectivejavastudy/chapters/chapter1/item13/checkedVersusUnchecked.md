### CheckedException vs UnCheckedException

점점 uncheckedException 을 사용하는 것이 추세이다. 예외처리를 따로 할 필요가 없어 간편하고 코드의 가독성, 명확성이 상승하기 때문이다.

그렇다면, 모든 예외 상황 시 uncheckedException 을 발생시키는 것이 무조건 옳은가?

그렇지 않다.

우선 unCheckedException 은 예외가 발생하더라도, 해당 코드를 호출하는 client 에서 후속으로 처리할 수 있는 일이 없을 때 발생시킨다.
어차피 client 가 복구 불가능한 에러이기에 예외처리를 따로 해주지 않는 것이다.

반대로 checkedException 은 특정 예외에 대한 후속처리가 가능할 때 발생시킨다.
예를 들어, 써드파티와 connection 하는 api 를 호출할 때, 연결이 진행되지 않으면 다시 시도를 하는 것이 그 후속조치가 될 수 있다.
따라서 이와 같은 경우, 해당 api 를 호출하는 client 에서 후속조치가 가능하므로 예외 발생을 명시하고 예외 처리를 강제하는 것이다.