package shape.xmlconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {
	public static void main(String[] args) {
		String configLocation = "shape/xmlconfig/applicationContext.xml";
		ApplicationContext context
			= new ClassPathXmlApplicationContext(configLocation);
		
//		System.out.println(context);
		
		System.out.println("=========================");
		Circle circle1 = (Circle)context.getBean("circle");
		System.out.println(circle1);
		
		Object mycircle = circle1.GetShapeOne();
		System.out.println(mycircle.toString());
		System.out.println();
		
		List<Object> mycirclelist = circle1.GetAllShape();
		System.out.println("도형 리스트");
		for(Object circle : mycirclelist) {
			System.out.println(circle.toString());
		}
		
		System.out.println("=========================");
		Rectangle shape2 = (Rectangle)context.getBean("rectangle");
		
		Object bean = shape2.GetShapeOne();
		System.out.println("사각형의 정보 : " + bean.toString());
		
		List<Object> myrectlist = shape2.GetAllShape();
		System.out.println("사각형 리스트");
		for(Object rect : myrectlist) {
			System.out.println(rect.toString());
		}
	}
}
