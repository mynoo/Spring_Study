package mycomputer;

public class Programmer01 {
	private String name;
	private String address;
	
	// 프로그래머가 컴퓨터에 의존(Dependency)
	private Computer01 computer;
	
	// 생성자 주입(Constructor Injection)
	public Programmer01(String name, String address) {
		this.name = name;
		this.address = address;
		
		this.computer = new Computer01(); // 객체 생성
		
		computer.setCpu("인텔 씨피유");
		computer.setHdd("삼성 ddd");
		computer.setMainboard("엘지 메인보드");
	}

	@Override
	public String toString() {
		return "Programer01 [name=" + name + ", address=" + address + ", computer=" + computer + "]";
	}
	
	
}
