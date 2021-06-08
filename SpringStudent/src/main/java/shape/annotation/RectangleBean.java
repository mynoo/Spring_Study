package shape.annotation;

// 사각형 1개를 의미하는 bean 클래스
public class RectangleBean {
	private double width ; // 밑변
	private double height ; // 높이
	
	public RectangleBean() {}
	
	// for constructor injection
	public RectangleBean(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		String imsi = "" ;
		imsi += "밑변 : " + width + ", 높이 : " + height + " \n" ;		
		imsi += "면적 : " + (width * height) + "\n" ;
		return imsi ;
	}	
}