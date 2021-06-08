package shape.annotation;

public class ShapeTest {
	public static void main(String[] args) {
		
		//Circle 클래스를 직접 이용하여 객체를 생성하고 있다.
		//이것을 강한 결합(tight coupling)이라고 부른다
		Circle circle1 = new Circle() ;		
		circle1.getProductOne() ;
		
		//인터페이스를 이용하여 형변환이 되고 있다.
		Shape circle2 = new Circle();
		circle2.getProductOne() ;
	}
}


/* 
강한 결합이란 클래스간의 결합력이 강해지고 의존력이 높은 결합을 의미한다.
Circle 클래스에 어떤 변경 사항이 생기면, 코드를 수정해야 하는 범위가 넓어질 가능성이 높다.

위의 예시에서 Circle 클래스 대신 다른 클래스를 사용한다고 가정하자.
이때 다른 클래스에 getProductOne()라는 메소드가 존재한다는 보장이 없다.

그래서, 약한 결합(loose coupling)을 만들기 위해서 인터페이스를 사용한다.
*/

/*
인터페이스를 이용하게 되면 상대적으로 의존 관계가 약해지게 된다.
인터페이스는 코딩상 강제 규약(추상 메소드)의 기능을 가지고 있기 때문에 변경에 강한 애플리케이션을 만들수 있다.
하지만 방대한 애플리케이션일 경우 인스턴스 생성을 여러 군데서 하는 경우에 역시 변경할 코드의 양도 많아지게 된다.
*/