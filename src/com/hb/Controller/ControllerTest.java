package com.hb.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hb.constant.LoginConstant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hb.entity.UserSt;

@Controller
public class ControllerTest {//��֧�����
       @RequestMapping("/pp.html")//Ҳ������ʵ��������ͬ����װ    ��������  ������.��ȥ
       protected String handleRequestInternal(@ModelAttribute("abc")UserSt st) throws Exception {
   		
   		System.out.println("�˻�:"+st.getZh()+"����:"+st.getMm()+"����:"+st.getLike()[0]);
   		
   		
   		return "/Zc.jsp";
   	}
       @RequestMapping("/cc.html")
       protected String handleRequestInternal1(HttpServletRequest req,//Model��ֵ  View ��ת
   			HttpServletResponse resp,HttpSession session) throws Exception {
   		String zh=req.getParameter("zh");

		   String mm=req.getParameter("mm");
   		System.out.println("账号为:"+zh+"密码为:"+mm);
   		/*ModelAndView num=new ModelAndView();
   		num.setViewName("/index.jsp");*/
   		session.setAttribute( LoginConstant.dlpz, zh);
   		return "/WEB-INF/manage/Main.jsp";
   	}
}
