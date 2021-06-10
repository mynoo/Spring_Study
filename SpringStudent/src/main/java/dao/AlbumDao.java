package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bean.Album;
import utility.Paging;

@Component("dao")
public class AlbumDao {
	// mapper 파일의 네임 스페이스 이름과 동일해야 합니다.
	private final String namespace = "MyAlbum";
	
	// 이 메소드를 스프링 설정 파일에서 setter injection 시키고 있다.
	@Autowired
	SqlSessionTemplate abcd;
	
	public int GetTotalCount(Map<String, String> map) {
		int cnt = -1;
		
		cnt = this.abcd.selectOne(namespace + ".getTotalCount", map);
		
		return cnt;
	}
	
	public List<Album> GetAlbumList(Paging pageinfo, Map<String, String> map){
		List<Album> lists = null;

		RowBounds rowBounds = new RowBounds(pageinfo.getOffset(), pageinfo.getLimit());
		
		lists = this.abcd.selectList(namespace + ".getAlbumList", map, rowBounds);
		
		return lists;
	}
}
