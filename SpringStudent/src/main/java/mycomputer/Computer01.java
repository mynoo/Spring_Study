package mycomputer;

public class Computer01 {
	private String cpu; // 씨피유
	private String hdd; // 하드 디스크
	private String mainboard; // 메인 보드
	
	// setter injection
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