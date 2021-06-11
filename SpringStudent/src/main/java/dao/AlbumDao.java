package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bean.Album;
import bean.CheckBean;
import utility.Paging;

@Component("dao")
public class AlbumDao {
	// mapper 파일의 네임 스페이스 이름과 동일해야 합니다.
	private final String namespace = "MyAlbum";
	
	// 이 메소드를 스프링 설정 파일에서 setter injection 시키고 있다.
	@Autowired
	SqlSessionTemplate abcd;
	
	// 앨범 정보 저장하기.
		public void insert(Album album) {
			System.out.println(this.getClass() + "insert 들어옴");
			this.abcd.insert(namespace + ".insert", album);
		}
	
	
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
	
	
	// 체크 박스, 라디오 버튼, 콤보 박스들의 내용을 가져 옵니다.
		public List<CheckBean> GetList(String module, String field) {		
			// module : 모듈 이름(회원_member, 상품_product, 앨범_album)
			// field : 테이블의 특정 컬럼 이름을 지정합니다.
			Map<String, String> map = new HashMap<String, String>();
			map.put("module", module) ;
			map.put("field", field) ;
			
			return this.abcd.selectList(namespace + ".GetList", map) ;
		}
	
	
	
	
	
}
