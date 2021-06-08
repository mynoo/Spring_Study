package shape.xmlconfig;

import java.util.List;

public interface Shape {
	public Object GetShapeOne(); // 도형 1개의 정보 가져 오기
	public List<Object> GetAllShape(); // 도형 여러개의 목록 정보 가져 오기
}
