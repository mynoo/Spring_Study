package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginCheckInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler) throws Exception {
		System.out.println("이 메소드는 지정된 컨트롤러가 동작하기 전에 가로 채는 역할을 합니다.");
		System.out.println("예를 들어서 \"로그인\"과 관련된 업무 처리는 여기서 하면 됩니다."); 
		System.out.println(this.getClass() + " preHandle 메소드 호출됨");
		System.out.println(handler.toString());
		System.out.println();
		
		HttpSession session = request.getSession() ;
		session.setAttribute("loginfo", "홍길동(hong)");

		return true; // false이면 컨트롤러는 더 이상 실행이 되지 않습니다.
	}
	@Override
	public void postHandle(HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("이 메소드는 지정된 컨트롤러의 동작이 마무리 된 이후에 처리되는 메소드입니다.");
		System.out.println(this.getClass() + " postHandle 메소드 호출됨");
		System.out.println(modelAndView.toString());
	}
	@Override
	public void afterCompletion(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler, Exception ex) throws Exception {
		System.out.println(this.getClass() + " afterCompletion 메소드 호출됨");	
	}
}
