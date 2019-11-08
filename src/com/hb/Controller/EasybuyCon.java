package com.hb.Controller;


import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.hb.entity.Easybuy_userentity;
import com.hb.entity.Easybuy_userentity1;



import com.hb.message.LoginTest.CheckLogin;
import com.hb.service.Easybuy;

@Controller
public class EasybuyCon {
	@Autowired
	private Easybuy easy;
  
@RequestMapping("/m.html")
  public String tiao(){
	
	  
	  return "/WEB-INF/ZcUser.jsp";
	  
	  
  }

@RequestMapping("/pp")
  public String tiao1(){
	 return "/WEB-INF/Restful.jsp";
	
}
@RequestMapping("/userid/{num1}")
 public String tiao2 (@PathVariable("num1") String id){
	 System.out.println("�û�idΪ"+id);
	 return "/WEB-INF/Restful.jsp";
}


  @ModelAttribute("userlist")//����֧������������ʲô�������ö�����ô˷���
  public List<Easybuy_userentity> getNames() throws Exception{
	 return easy.NameCx();
  }
  @RequestMapping("/oo.html")
  public String Zcuser5(@Validated(value={CheckLogin.class}) Easybuy_userentity1 user,BindingResult r,Model ts) throws Exception{
	  
	  if(r.hasErrors()){
		  return "/WEB-INF/ZcUser.jsp";
	  }else{
		  if(easy.ZcUser1(user)){
			  ts.addAttribute("ts", "注册成功");
		  }else{
			  ts.addAttribute("ts", "注册失败");
		  }
		  return "/WEB-INF/ZcUser.jsp";
	  }
	  
	  
  }
  @RequestMapping("/error.html")
  public String errorReport()throws Exception{
	return "/WEB-INF/errorReport.jsp";
	  
  }
  @RequestMapping("/zp.html")
  public String zptc()throws Exception{
	  return "/WEB-INF/photo.jsp";
  }
  @RequestMapping("/zp555.html")
  public String zptc1(@RequestParam("zp") MultipartFile zp,HttpServletRequest req,Model p)throws Exception{
	  String name=zp.getOriginalFilename();//���ԭ�ļ���
	  File file=new File(req.getRealPath("/")+"photo/"+name);
	  zp.transferTo(file);
	  System.out.println(file);
	  p.addAttribute("tishi", "�ϴ��ɹ�");
	 return "/WEB-INF/photo.jsp";
	
	  
  }
  @RequestMapping(value="/ajax.html")
  @ResponseBody
  public String test(String zh)throws Exception{
	  String rs;
	    List<Easybuy_userentity> p=easy.NameCx();
	    rs=JSON.toJSONString(p);
	  return rs ;
	  
  }
  @RequestMapping("/ajax1.html")
  @ResponseBody
  public String test1()throws Exception{
	  
	    List<Easybuy_userentity> p=easy.NameCx();
	    
	  return JSON.toJSONString(p);
	  
  }
/* @RequestMapping("/loginYz.html")
  public String test2(@Validated(value={AdminLogin.class}) Easybuy_userentity1 user,BindingResult r){
	if(r.hasErrors()){
		return "/m.html";
		
	}else{
	 
	 
	}
	  
  }*/
 
}
