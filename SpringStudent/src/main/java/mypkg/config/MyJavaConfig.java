package mypkg.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyJavaConfig {	
    @Bean // @Bean으로 명시된 메소드의 이름이 빈 객체의 이름이 됩니다.
    public Member myuser(){
        return new Member("hong", "홍길동", 30) ;
    }
    // 의 코드는 다음과 등가의 개념입니다.
    // Member myuser = new Member("hong", "홍길동", 30) ;
    
    @Bean
    public Member youruser(){
        return new Member("park", "박영희", 20) ;
    }
    
    // 리턴되는 메소드의 이름이 아닌 다른 식별값으로 사용하려면 name 속성을 사용하면 됩니다.
    // name 속성이 들어가면 name 속성의 값이 객체 이름이됩니다.
    @Bean(name="renamechoi") 
    public Member choi(){ // 이 때 메소드 이름인 choi는 사용이 불가능합니다.
        return new Member("choi", "최영", 10000) ;
    }
    // 의 코드는 다음과 등가의 개념입니다.
    // Member renamechoi = new Member("choi", "최영", 10000) ;
    
    @Bean
    public List<Member> allList(){
    	List<Member> lists = new ArrayList<Member>() ;
    	lists.add(myuser()) ;
    	lists.add(youruser()) ;
    	lists.add(choi()) ;
    	return lists;
    }
}



// @Value
/*
스프링에서는 properties파일에 있는 데이터를 @Value 어노테이션을 이용해 Class에 주입해 사용할 수 있습니다.
그러나  @ Value 어노테이션은 
스프링 설정 초기 로딩할때 딱한번 세팅되기 때문에 일반 Class에는 사용할 수 없도록 되어 있습니다.
그러니까, 스프링 로딩시 로딩되는 Class가 아니라면 @Value어노테이션으로 초기값을 설정 할 수 없습니다.

*/
//@PropertySources

//@Configuration 어노테이션이 명시된 클래스를 설정 정보 파일로 사용하겠습니다.
//@PropertySources(@PropertySource("classpath:/db.properties"))
//@PropertySources(@PropertySource("mypkg/db.properties"))

// @Value("${db.driver}")
// private String driver;
