package shape.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myRectangle")
public class Rectangle implements Shape{
	@Autowired(required = true)
	@Qualifier("myRectangleDao")
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




