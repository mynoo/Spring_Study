package shape.xmlconfig;

import java.util.List;

// 도형과 관련하여 데이터 베이스와 연동시킬 다오 인터페이스
public interface ShapeDao {
	public Object GetShapeOne(); // 도형 1개의 정보 가져 오기
	public List<Object> GetAllShape(); // 도형 여러개의 목록 정보 가져 오기
}