package shape.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("myCircleDao")
// CircleDao myCircleDao = new CircleDao() ; 
// 데이터 베이스와 원(Circle) 정보를 연동하기 위한 구현체 클래스
public class CircleDao implements ShapeDao{
	@Override
	public Object GetShapeOne() {
		// 하나의 원 정보를 반환해 줍니다.
		return new CircleBean(3.0, 4.0, 5.0);
	}

	@Override
	public List<Object> GetAllShape() {
		// 여러 개의 원을 목록으로 반환해 줍니다.
		List<Object> lists = new ArrayList<Object>();
		lists.add(new CircleBean(3.0, 4.0, 5.0));
		lists.add(new CircleBean(5.0, 6.0, 7.0));
		lists.add(new CircleBean(2.0, 3.0, 4.0));
		return lists;
	}
}