package mycomputer;

public class Computer {
	private String cpu; // 씨피유
	private String hdd; // 하드 디스크
	private String mainboard; // 메인 보드
	
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", hdd=" + hdd + ", mainboard=" + mainboard + "]";
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public void setMainboard(String mainboard) {
		this.mainboard = mainboard;
	}
	
	
	
}
