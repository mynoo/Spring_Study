package shape.annotation;

import java.util.List;

// 다오 인터페이스와 연동을 하기 위한 서비스 인터페이스
// 서비스 : 사각형, 삼각형, 원 등의 업무 모듈의 집합체
public interface Shape {
	// 하고자 하는 업무 스펙 명시
		public Object GetShapeOne(); // 도형 1개의 정보 구하기
		public List<Object> GetAllShape(); // 모든 도형의 정보 구하기
}