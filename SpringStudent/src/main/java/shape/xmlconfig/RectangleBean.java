package shape.xmlconfig;

// 원 1개를 표현하는 클래스
public class RectangleBean {
	private double width; // x좌표
	private double height; // y좌표
	

	public RectangleBean(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	public String toString() {
		String imsi = "";
		imsi += "밑변 : " + width + "\n";
		imsi += "높이 : " + height + "\n";
		imsi += "높이 : " + (height * width) + "\n";
		
		return imsi;
	}
	
	
	
}
