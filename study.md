---
marp: true
theme: simple
paginate: true
header: 'Header'
footer: 'Footer'
---



# 7장
## 연산자 오버로딩과 기타 관례

---
## 다루는 내용
- 연산자 오버로딩
- 관례: 여러 연산을 지원하기 위해 특별한 이름이 붙은 메소드
- 위임 프로퍼티
---
## 연산자 오버로딩
- 연산자란? : + - / *
- 오버로딩? : 재정의
- 연산자 + 오버로딩 : 연산자를 재정의한다
- 어떻게? : 특정 구문이 담긴 함수를 구현함으로써
- java에는 없으나 많은 다른 함수형 언어에서 지원
- kotlin에서도 지원
- 클래스 안에서 특정 키워드로 되어 있는 메소드를 정의하면 된다
- 코틀린의 관례 :(Convention) : 어떤 언어 기능과 미리 정해진 이름의 함수를 연결해주는 기법

---
## 7.1 산술 연산자 오버로딩
### 7.1.1 이항 산술 연산 오버로딩
#### 포인트 클래스 정의하기 (Java)
```java
class Point() {
int x;
int y;
Point (int x, int y) {
this.x = x;
this.y = y;
}
// getters ...
// equals&hashcode&toString
}
```
#### 포인트 클래스 정의하기 (Kotlin)
```kotlin
data class Point(val x: Int, val y: Int)
```
---
#### 포인트 클래스 정의하기 (Java)
```java
class Point() {
// ... 생략
public Point plus(Point other) {
return new Point(this.x + other.getX() + , this.y + other.getY());
}
}
```
#### 포인트 클래스 정의하기 (Kotlin)
```kotlin
data class Point(val x: Int, val y: Int) {
operator fun plus(other: Point): Point {
return Point(x + other.x,y + other.y)
}
}
```
- `operator` 함수에 키워드를 붙여야 한다. 없으면 컴파일 에러
---
#### 포인트 클래스 정의하기 (Java)
```java
Point a = new Point(1,2);
Point b = new Point(3,4);
Point addition = a.plus(b);
```
#### 포인트 클래스 정의하기 (Kotlin)
```kotlin
val a = Point(1,2);
val b = Point(3,4);
val addition = a + b;
```
---
#### 확장 함수로 정의하기
```kotlin
data class Point(val x: Int, val y: Int)
operator fun Point.plus(other: Point): Point {
return Point(x + other.x, y + other.y)
}
```
- 미리 정해둔 연산자만 오버로딩 할 수있음
- 연산자 우선순위
- 1순위 : `*` `/` `%`
- 2순위 : `+` `-`
- a + b * c == a + (b * c)

---
| 식 | 함수명 |
|---|-------|
| a * b | times |
| a / b | div |
| a % b | mod(1.1부터 rem) |
| a + b | plus |
| a - b | minus |

---


## 7.1 산술 연산자 오버로딩
### 7.1.1 복합 대입 연산자 오버로딩
### 7.1.2 복합 대입 연산자 오버로딩
---
## 7.1 산술 연산자 오버로딩
### 7.1.3 단항 연산자 오버로딩
---
## 7.2 비교 연산자 오버로딩
### 7.2.1 동등성 연산자: equals
---
## 7.2 비교 연산자 오버로딩
### 7.2.2 순서 연산자: compareTo
---
## 7.3 컬렉션과 범위에 대해 쓸 수 있는 관례
### 7.3.1 인덱스로 원소에 접근: get과 set

관례 == convention

---
## 7.3 컬렉션과 범위에 대해 쓸 수 있는 관례
### 7.3.1 인덱스로 원소에 접근: get과 set
---
## 7.3 컬렉션과 범위에 대해 쓸 수 있는 관례
### 7.3.2 in 관례
---
## 7.3 컬렉션과 범위에 대해 쓸 수 있는 관례
### 7.3.3 rangeTo 관례
---
## 7.3 컬렉션과 범위에 대해 쓸 수 있는 관례
### 7.3.4 for 루프를 위한 iterator 관례
---
## 7.4 구조 분해 선언과 component 함수
---
## 7.4 구조 분해 선언과 component 함수
### 7.4.1 구조 분해 선언과 루프
---
## 7.5 프로퍼티 접근자 로직 재활용: 위임 프로퍼티
### 7.5.1 위임 프로퍼티 소개
---
## 7.5 프로퍼티 접근자 로직 재활용: 위임 프로퍼티
### 7.5.2 위임 프로퍼티 사용: by lazy()를 사용한 프로퍼티 초기화 지연
---
## 7.5 프로퍼티 접근자 로직 재활용: 위임 프로퍼티
### 7.5.3 위임 프로퍼티 구현
---
## 7.5 프로퍼티 접근자 로직 재활용: 위임 프로퍼티
### 7.5.4 위임 프로퍼티 컴파일 규칙
---
## 7.5 프로퍼티 접근자 로직 재활용: 위임 프로퍼티
### 7.5.5 프로퍼티 값을 맵에 저장
---
## 7.5 프로퍼티 접근자 로직 재활용: 위임 프로퍼티
### 7.5.6 프레임워크에서 위임 프로퍼티 활용
---
## 7.6 요약






---

| 식 | 함수명 |
|---|-------|
| a * b | times |
| a / b | div |
| a % b | mod(1.1부터 rem) |
| a + b | plus |
| a - b | minus |
