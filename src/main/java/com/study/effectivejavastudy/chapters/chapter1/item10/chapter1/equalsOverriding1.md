### equals 오버라이딩 시 지켜야할 규칙

1. 반사성(Reflexivity)
   <br>객체는 스스로와 비교했을 때 항상 true를 반환해야 한다. 즉, x.equals(x)는 항상 true여야 한다.
   <br><br>
2. 대칭성(Symmetry)
   <br>두 객체가 서로에 대해 동일하다고 판단되면, 그 결과는 상호적이어야 한다. 예를 들어, x.equals(y)가 true라면 y.equals(x)도 true여야 한다.
   <br><br>
3. 추이성(Transitivity)
   <br>만약 x.equals(y)가 true이고, y.equals(z)도 true라면, x.equals(z)도 true여야 한다.
   <br><br>
4. 일관성(Consistency)
   <br>두 객체의 상태가 변경되지 않는 한, equals 메소드는 동일한 객체에 대해 항상 일관된 결과를 반환해야 한다.
   <br><br>
5. null에 대한 비교
   <br>모든 객체는 null과 비교했을 때 false를 반환해야 한다. 즉, x.equals(null)은 항상 false여야 한다.
   <br><br>
6.

### 상속의 경우

특정 class 를 상속받아 필드를 추가하고 equals 를 오버라이딩하는 경우 대칭성 혹은 추이성이 위배된다.
따라서 이러한 경우 상속이 아닌 구성(composition)을 사용하는 것이 권장된다.
