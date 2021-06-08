package shape.xmlconfig;

import java.util.ArrayList;
import java.util.List;

// 실제로 데이터베이스와 연동을 수행하여 데이터를 가져오는 클래스
public class RectangleDao implements ShapeDao{

	@Override
	public Object GetShapeOne() {
		RectangleBean bean = new RectangleBean(4.0, 3.0);
		return bean;
	}

	@Override
	public List<Object> GetAllShape() {
		List<Object> lists = new ArrayList<Object>();
		
		lists.add(new RectangleBean(3.0, 5.0));
		lists.add(new RectangleBean(6.0, 5.0));
		
		return lists;
	}

}