package shape.annotation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {
	public static void main(String[] args) {
		String configLocation = "/shape/annotation/applicationContext.xml";
		ApplicationContext context 
			= new ClassPathXmlApplicationContext(configLocation) ;
		
		// Shape 형태의 객체 중에서 객체 이름이 "myCircle"인 항목을 찾아 주세요.
		Shape shape1 = context.getBean("myCircle", Shape.class) ;
		Object data1 = shape1.GetShapeOne() ;
		System.out.println("원의 정보 : ");
		System.out.println(data1.toString());
		List<Object> lists1 = shape1.GetAllShape() ; 
		System.out.println("원의 목록 보기");
		for(Object obj : lists1) {
			System.out.println(obj);
		}
		
		System.out.println("----------------------------------------");
		Shape shape2 = context.getBean("myRectangle", Shape.class) ;
		Object data2 = shape2.GetShapeOne() ;
		System.out.println("사각형의 정보 : ");
		System.out.println(data2.toString());
		List<Object> lists2 = shape2.GetAllShape() ; 
		System.out.println("사각형의 목록 보기");
		for(Object obj : lists2) {
			System.out.println(obj);
		}
	}
}