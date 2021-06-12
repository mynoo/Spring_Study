package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.AlbumDao;

@Controller // 앨범 삭제하기
public class AlbumDeleteController { 
	private final String requesturl = "/delete.al" ;
	private final String redirect = "redirect:/list.al" ;
	
	@Autowired
	@Qualifier("dao")
	AlbumDao albumDao ; 
	
	@GetMapping(requesturl)
	public ModelAndView doGet(
			@RequestParam(value = "id", required = true) int id ) {
		//파라미터로 넘어오는 num 값 읽어 오기
		this.albumDao.delete(id) ;
		
		return new ModelAndView(redirect) ;
	}
}