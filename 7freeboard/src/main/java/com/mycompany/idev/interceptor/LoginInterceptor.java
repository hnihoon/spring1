package com.mycompany.idev.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import com.mycompany.idev.dto.Administrator;
import com.mycompany.idev.dto.Member;

public class LoginInterceptor implements HandlerInterceptor {
	private static final Logger log = LoggerFactory.getLogger(LoginInterceptor.class);
	
	
	@Override   
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		Member user = (Member) session.getAttribute("user");   
  			
		if(user == null) {  //로그인 정보 있나? -> 로그인 X
			String msg="로그인 하세요.";
			String url=request.getContextPath();
 			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter(); 
			StringBuilder alerts = new  StringBuilder("<script>alert('") 
					  .append(msg)
					  .append("');")
					  .append("location.href='")
					  .append(url)
					  .append("';")
					  .append("</script>"); 
			out.print(alerts.toString()); 
			//out.flush();		//출력버퍼 비우기
			
			return false;	//요청에 정해진 handler 메소드로 제어(실행)가 이동되지 않습니다.
		}else {
		//로그인 된 상태이므로 요청에 따라 handler 메소드로 이동합니다.
			return true;
		}
	}
}
