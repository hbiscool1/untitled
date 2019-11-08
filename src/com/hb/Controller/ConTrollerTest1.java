package com.hb.Controller;

import com.hb.entity.TpaperSt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hb.service.Easybuy;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ConTrollerTest1  {
	@Autowired
	private Easybuy easy;
	@RequestMapping("/manage/fy")
	 public String tiao(){
		 return "/WEB-INF/manage/Main.jsp";
		
	}
	
	@RequestMapping("/manage/fy1")
	public String tiao1(){
		return "/WEB-INF/manage/SpFyCx.jsp";

	}
	@RequestMapping("/tpaperSt")
	public String tiao2(TpaperSt pp,HttpServletRequest req){
		try {
			if(easy.Zctpaper(pp)){
				req.setAttribute("tishi","注册成功");
			}else{
				req.setAttribute("tishi","注册失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/transverter.jsp";

	}
	
}
