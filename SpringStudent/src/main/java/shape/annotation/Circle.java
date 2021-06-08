package shape.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 클래스 객체 = new 생성자() ;
// @Component // Circle circle = new Circle() ;
// @Component 어노테이션은 클래스 이름을 소문자로 만들어서 객체를 생성해줍니다.

@Component("myCircle") // Circle myCircle = new Circle() ;
public class Circle implements Shape{
	
	// required = true는 반드시 해주셔야합니다.
	@Autowired(required = true) // 이 변수는 자동으로 주입을 하도록 하겠습니다.
	@Qualifier("myCircleDao") // ShapeDao 타입 중에서 이름이 "myCircleDao"인 항목을 찾아 주세요.
	// shapeDao는 외부에서 주입되어야 합니다.
	private ShapeDao shapeDao ; // for 약한 결합
	
	@Override
	public Object GetShapeOne() {
		return this.shapeDao.GetShapeOne() ;
	}
	@Override
	public List<Object> GetAllShape() {
		return this.shapeDao.GetAllShape() ;
	}
}