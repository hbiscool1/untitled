package com.hb.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class LoginController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		//����һ
		String zh=req.getParameter("zh");
		
		String mm=req.getParameter("mm");
		System.out.println("�˻�:"+zh+"����:"+mm);
		ModelAndView num=new ModelAndView();
		num.setViewName("/Hy.jsp");
		return num;
	}

}
