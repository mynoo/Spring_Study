package shape.circle;

public class Point {
	private double xpos ;
	private double ypos ;
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}
	public void setYpos(double ypos) {
		this.ypos = ypos;
	}
	
	@Override
	public String toString() {
		String imsi = ""; 
		imsi += "x 좌표 : " + this.xpos + ", " ;
		imsi += "y 좌표 : " + this.ypos + "\n" ;
		
		return imsi ;
	}
}
