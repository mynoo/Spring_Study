package shape.xmlconfig;

import java.util.ArrayList;
import java.util.List;

public class RectangleDao implements ShapeDao{

	@Override
	public Object GetShapeOne() {
		RectangleBean bean = new RectangleBean(3.0, 4.0);
		return bean;
	}

	@Override
	public List<Object> GetAllShapes() {
		List<Object> lists = new ArrayList<Object>();
		
		lists.add(new RectangleBean(3.0, 5.0));
		lists.add(new RectangleBean(6.0, 5.0));
		return lists;
	}
	
}
