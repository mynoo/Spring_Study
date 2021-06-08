# Spring_Study

======2021년 06월 07일========
- 이클립스 Spring Tool Suite(STS) 설치
- 강한결합, 약한결합 (의존성)
- MVC 패턴
- 
      - 개발 할 때, 3가지 형태로 역할을 나누어 개발하는 방법론
      - Model : 백그라운드에서 동작하는 로직을 처리한다.
      - View : 사용자가 보게 될 결과 화면을 출력한다.
      - Controller : 사용자의 입력처리와 흐름 제어를 담당한다.
- 프레임워크(Framework) : 어떤 문제를 해결하기 위한 잘 설계된 재사용이 가능한 코드(모듈)들의 집합을 말합니다
- DI(Dependency Injection)
      객체를 직접 생성하는 게 아니라 외부에서 생성한 후 주입 시켜주는 방식
- IoC(Inversion of Control)
      메소드나 객체의 호출작업을 개발자가 결정하는 것이 아니라, 외부에서 결정되는 것을 의미



======2021년 06월 08일========

- Annotation
      - 주석이라는 사전적의미가 있으며 컴파일 혹은 런타임에 해석된다
      - 메타데이터(실제데이터가 아닌 Data를 위한 데이터) 라고도 불리고 JDK5부터 등장
      - @Component : 해당 클래스가 스프링에서 객체로 만들어서 관리하는 대상임을 명시하는 어노테이션
      - @ComponentScan : @Component가 있는 클래스를 스프링이 읽어주도록 하는 어노테이션
      - @Autowired : 객체를 자동으로 주입하는 어노테이션
      - @Autowired(required=false)  // required를 false로 하여 주입 안받아도 예외처리 하지 않도록 함. // 기본값은 true
      - @Qualifier : 사용할 의존 객체를 선택할 수 있도록 해준다.


- AOP
      - 핵심 기능과 공통 기능을 분리시켜놓고, 공통 기능을 필요로하는 핵심 기능들에서 사용하는 방식
      즉 핵심기능과 공통 기능을 분리시킨다.
<br>

- dispatcher-servlet
            - Servlet Container에서 HTTP프로토콜을 통해 들어오는 모든 요청을 프레젠테이션 계층의 제일앞에 둬서 중앙집중식으로 처리 <br>
            - Front Controller와 같은 개념<br>
            - 기존 -> url당 servlet을 생성하고 그에 맞는 Controller에게 요청을 보내주는 코드를 각각 따로 작성<br>
            - dispatcher servlet을 통하여 모든 요청을 한곳에서 받아서 처리<br>






