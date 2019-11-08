package com.hb.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class LoginController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		//方法一
		String zh=req.getParameter("zh");
		
		String mm=req.getParameter("mm");
		System.out.println("账户:"+zh+"密码:"+mm);
		ModelAndView num=new ModelAndView();
		num.setViewName("/Hy.jsp");
		return num;
	}

}
