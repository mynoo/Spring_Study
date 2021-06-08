package shape.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("myRectangleDao")
// RectangleDao myRectangleDao = new RectangleDao() ;
// 데이터 베이스와 사각형(Rectangle) 정보를 연동하기 위한 구현체 클래스
public class RectangleDao implements ShapeDao{
	@Override
	public Object GetShapeOne() {
		// 하나의 사각형 정보를 반환해 줍니다.
		return new RectangleBean(10.0, 20.0);
	}

	@Override
	public List<Object> GetAllShape() {
		// 여러 개의 사각형을 목록으로 반환해 줍니다.
		List<Object> lists = new ArrayList<Object>();
		lists.add(new RectangleBean(10.0, 20.0));
		lists.add(new RectangleBean(10.0, 10.0));
		return lists;
	}
} 