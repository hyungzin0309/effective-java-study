## Enum

### 사용 시 주의사항

1. Key 로 하는 Map 이나 Enum 을 담는 Set 은 각각 EnumMap 과 EnumSet 을 사용하라
2. 비교 시 equals 가 아닌 '==' 사용
    1. Enum 내 type 은 어차피 하나의 인스턴스를 보장받기 때문에, null pointer exception 발생가능한 equals 대신 == 사용이 권장된다. 