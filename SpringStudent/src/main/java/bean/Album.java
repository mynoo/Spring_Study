package bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class Album {
	private final String MUST_INPUT = "필수 입력 사항입니다." ;
	
	private int id;	
	
	@Length(min=5, max=12, message="앨범 이름은 최소 5자리 최대 12자리 입니다.")	
	private String albumname;	
	
	@NotEmpty(message="노래 제목은 " + MUST_INPUT )
	private String song;	
	
	@Length(min=3, max=12, message="작사자 이름은 최소 3자리 최대 12자리 입니다.")
	@NotEmpty(message= "작사자 이름은 " + MUST_INPUT )
	private String lyricist; // 작사
	
	@Length(min=3, max=12, message="작곡자 이름은 최소 3자리 최대 12자리 입니다.")
	@NotEmpty(message= "작곡자 이름은 " + MUST_INPUT )
	private String songwriter; // 작곡
	
	private String transcription; // 편곡
	
	@Pattern(regexp = "\\d{4}[-/]\\d{2}[-/]\\d{2}", message = "날짜는 yyyy/MM/dd 또는 yyyy-MM-dd 형식으로 입력해 주세요.")
	private String writerdate; // 날짜	
	
	//업로드 관련 항목
	// image는 테이블의 컬럼 이름과 동일하게 작성해야 합니다.
	// 그림 이름을 저장할 문자열입니다.
	private String image ;	

	//@Range(min=1, message="장르를 반드시 선택해 주세요.")
	@Pattern(regexp = "[^-]*", message = "장르를 반드시 선택해 주세요.")
	private String genre ; // 장르(콤보 박스)
	
	@NotNull(message="미디어 유형은(는) 반드시 선택해 주셔야 합니다.")
	private String mediatype ; // 미디어 유형(체크 박스)	
	
	@NotNull(message="이메일 수신 여부를 반드시 선택해 주세요.")
	private String emailagree ; // 이메일 수신 여부(라디오 버튼)
	
	//form 태그의 name 속성의 이름과 동일하게 ...
	// 변수 abcd는 멀티 파트 파일 객체입니다. 
	// 주의 사항으로 폼의 name 속성의 값과 Bean 클래스의 MultipartFile 변수의 이름이 동일해야 합니다.
	private MultipartFile abcd ;	
		

	@Override
	public String toString() {
		return "Album [id=" + id + ", albumname=" + albumname + ", song=" + song + ", lyricist=" + lyricist
				+ ", songwriter=" + songwriter + ", transcription=" + transcription + ", writerdate=" + writerdate
				+ ", image=" + image + ", genre=" + genre + ", mediatype=" + mediatype + ", emailagree=" + emailagree
				+ ", abcd=" + abcd + "]";
	}

	// setter, getter, 생성자 등을 구현합니다.		
	public Album() { }
	
	public MultipartFile getAbcd() {
		return abcd;
	}
	public void setAbcd(MultipartFile abcd) {
		this.abcd = abcd;
		
		// 업로드가 잘 되었다면 널이 아닙니다.
		if( this.abcd != null){ 
			this.image = this.abcd.getOriginalFilename();
		}		
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
}