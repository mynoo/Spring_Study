package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.AlbumDao;

@Controller
public class AlbumListController {
	@Autowired
	@Qualifier("dao")
	private AlbumDao albumDao;
	
	@RequestMapping(value = "/list.al")
	public ModelAndView xxx() {
		String what = null;
		String keyword = null;
		
		// 필드 검색을 위한 맵
		Map<String, String> map = new HashMap<String, String>();
		
		if(what != null && what.equals("all")) {
			what = null;
		}
		map.put("what", what);
		
		// %는 데이터 베이스의 like 연산자 때문에 사용함
		map.put("keyword", "%" + keyword + "%");
		
		int totalCount = albumDao.GetTotalCount(map);
		System.out.println("totalCount : " + totalCount);
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("alList");
		mav.addObject("totalCount", totalCount);
		
		return mav;
	}
}