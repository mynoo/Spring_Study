package model;

public class Job {
	private int code; // 직업 코드
	private String name; // 직업 이름
	
	public Job(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Job [code=" + code + ", name=" + name + "]";
	}
	
	
}
