package model;

public class Hobby {
	private String english; // 영문 이름
	private String korean; // 한글 이름
	
	public Hobby(String english, String korean) {
		super();
		this.english = english;
		this.korean = korean;
	}

	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getKorean() {
		return korean;
	}
	public void setKorean(String korean) {
		this.korean = korean;
	}
}
