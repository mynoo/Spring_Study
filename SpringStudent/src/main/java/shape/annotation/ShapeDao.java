package shape.annotation;

import java.util.List;

// 데이터 베이스와 연동을 하기 위한 다오 인터페이스
public interface ShapeDao {
	// 하고자 하는 업무 스펙 명시
	public Object GetShapeOne(); // 도형 1개의 정보 구하기
	public List<Object> GetAllShape(); // 모든 도형의 정보 구하기
}