package mypkg.config;

public class Member {
	private String id ;
	private String name ;
	private int age ;	
	
	public Member() {
	
	}
    public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

    @Override
    public String toString() {
        String imsi = "아이디 : " + this.id + "\n" ; 
        imsi += "이름 : " + this.name + "\n" ; 
        imsi += "나이 : " + this.age   ; 
    	return imsi ;
    }
}