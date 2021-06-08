package mycomputer;

public class Computer01 {
	private String cpu ; //시피유
	private String hdd ; //하드 디스크
	private String mainboard ;	//메인 보드
	
	// 외부에서 데이터를 입력할 수 있도록 setter를 구현합니다.	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public void setMainboard(String mainboard) {
		this.mainboard = mainboard;
	}
	
	
	@Override
	public String toString() {
		return "Computer01 [cpu=" + cpu + ", hdd=" + hdd + ", mainboard=" + mainboard + "]";
	}
	
	
	
}