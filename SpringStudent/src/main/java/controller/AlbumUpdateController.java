package controller;

import java.io.File;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import bean.Album;
import bean.CheckBean;
import dao.AlbumDao;

@Controller
public class AlbumUpdateController { // 앨범 수정하기
	private final String commandName = "album" ;
	
	@ModelAttribute(commandName)
	public Album some() {
		return new Album();
	}	
	
	@Autowired
	@Qualifier("dao")
	private AlbumDao albumDao ;
	
	@ModelAttribute("mediatypelist")  // 미디어 유형
	public List<CheckBean> aaa(){
		List<CheckBean> lists = this.albumDao.GetList("album", "mediatype") ;
		return lists ;
	}	
	@ModelAttribute("emailagreelist")  // 이메일 수신 여부 관련
	public List<CheckBean> bbb(){
		List<CheckBean> lists = this.albumDao.GetList("album", "emailagree") ;
		return lists ;
	}	
	@ModelAttribute("genrelist")  // 장르 목록
	public List<CheckBean> ccc(){
		List<CheckBean> lists = this.albumDao.GetList("album", "genre") ;
		return lists ;
	}	

	private final String requesturl = "/update.al" ; // 요청 url
	
	private final String gotoPage = "alUpdateForm" ; // 가고자 하는 페이지
	
	private final String redirect = "redirect:/list.al" ; // 리다이렉션을 위한 페이지
	
	@GetMapping(value = requesturl)
	public ModelAndView doGet(
			@RequestParam(value="id", required = true) int id ) {
		// 기본 키를 사용하여 이전에 기입했던 Album 정보를 읽어 옵니다.
		System.out.println("AlbumUpdateController:id : " + id ); 
		
		Album album = this.albumDao.getAlbumById(id);
		System.out.println("이전 앨범의 정보");
		System.out.println(album.toString()); 
		
		return new ModelAndView(gotoPage, "album", album) ;
	}

	@PostMapping(value = requesturl)
	public ModelAndView doPost(
			@ModelAttribute("album") @Valid Album xxx,
			BindingResult asdf,
			HttpServletRequest request) {
		
		System.out.println("커맨드 객체 정보 : ");
		System.out.println(xxx.toString());
		
		
		ModelAndView mav = new ModelAndView() ;
		
		if (asdf.hasErrors()) {
			System.out.println("유효성 검사에 문제가 있슴");
			System.out.println(asdf.toString());
			mav.setViewName(gotoPage); 
			
		}else {
			System.out.println("유효성 검사에 문제가 없슴");
			// 파일 업로드를 진행
			MultipartFile multi = xxx.getAbcd() ;
			String uploadPath = "/WEB-INF/upload" ; // 업로드가 되는 폴더 이름
			
			// 업로드 파일이 저장되는 실제 경로 
			String realPath = request.getRealPath(uploadPath) ;
			System.out.println(realPath);
			
			try {
				// 업로드 폴더에 파일을 업로드합니다.
				File destination = utility.Utility.getUploadedFileInfo(multi, realPath) ;				 
				multi.transferTo(destination);
				
				System.out.println(this.getClass() + " 앨범 수정하기 command 정보");
				System.out.println(xxx.toString());
				
				// 최초 등록시 업로드된 이미지는 삭제 되는 게 정석입니다.
								
				// 원래 이미지에 날짜를 붙인 새 이미지 이름
				xxx.setImage(destination.getName());
				
				// dao를 이용하여 데이터 베이스에 행을 수정합니다.
				this.albumDao.update(xxx);				 

				// response.sendRedirect("list.al")와 등가의 개념
				mav.setViewName(redirect); // 리다이렉션				
				
			} catch (IllegalStateException e) {				
				e.printStackTrace();
				mav.setViewName("redirect:/update.al" + "?id=" + xxx.getId()); 
				
			} catch (Exception e) {
				e.printStackTrace();
				mav.setViewName("redirect:/update.al" + "?id=" + xxx.getId()); 
			}			
		}		
		return mav  ;
	}
}
