package bean;

import org.springframework.web.multipart.MultipartFile;

public class Album {
	private int id;
	private String albumname;
	private String song;
	private String lyricist; // 작사
	private String songwriter; // 작곡
	private String transcription; // 편곡
	private String writerdate; // 날짜
	
	//업로드 관련 항목
	// image는 테이블의 컬럼 이름과 동일하게 작성해야 합니다.
	// 그림 이름을 저장할 문자열입니다.
	private String image;
	
	private String genre; // 장르(콤보 박스)
	private String mediatype; // 미디어 유형(체크 박스)
	private String emailagree; // 이메일 수신 여부(라디오 버튼)
	
	// form 태그의 name 속성의 이름과 동일하게...
	// 변수 abcd는 멀티 파트 파일 객체입니다.
	// 주의사항으로 폼의 name 속성의 값과 Bean 클래스의 MultipartFile 변수의 이름이 동일해야 합니다.
	private MultipartFile abcd;
	
	// setter, getter, 생성자 등을 구현합니다.
	public Album() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlbumname() {
		return albumname;
	}

	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getLyricist() {
		return lyricist;
	}

	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}

	public String getSongwriter() {
		return songwriter;
	}

	public void setSongwriter(String songwriter) {
		this.songwriter = songwriter;
	}

	public String getTranscription() {
		return transcription;
	}

	public void setTranscription(String transcription) {
		this.transcription = transcription;
	}

	public String getWriterdate() {
		return writerdate;
	}

	public void setWriterdate(String writerdate) {
		this.writerdate = writerdate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getMediatype() {
		return mediatype;
	}

	public void setMediatype(String mediatype) {
		this.mediatype = mediatype;
	}

	public String getEmailagree() {
		return emailagree;
	}

	public void setEmailagree(String emailagree) {
		this.emailagree = emailagree;
	}

	public MultipartFile getAbcd() {
		return abcd;
	}

	public void setAbcd(MultipartFile abcd) {
		this.abcd = abcd;
	}
	

	
	
}
