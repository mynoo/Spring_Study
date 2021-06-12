package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bean.Album;
import dao.AlbumDao;

@Controller // 앨범 상세 보기 기능입니다.
public class AlbumDetailController { 
	private final String requesturl = "/detail.al" ;
	
	@Autowired
	@Qualifier("dao")
	AlbumDao albumDao ; 
	
	@GetMapping(requesturl)
	public ModelAndView doGet(
			@RequestParam(value = "id", required = true) int id) {
		Album album = this.albumDao.getAlbumById(id) ;
		
		String viewName = "alDetail" ;
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		mav.addObject("album", album) ;
		
		return mav ;
	}
}