package com.hb.service.impl;

import java.util.List;

import com.hb.entity.TpaperSt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hb.dao.EasybuyJK;

import com.hb.entity.Easybuy_userentity;
import com.hb.entity.Easybuy_userentity1;
import com.hb.service.Easybuy;
@Service
public class Easybuyimpl implements Easybuy {
    @Autowired //自动注解不需要getset方法
    private EasybuyJK po;

	public boolean ZcUser(Easybuy_userentity user) throws Exception {
	  if( po.zhuce(user)>0){
		  return true;
	  }		
	  return false;
	}


	public List<Easybuy_userentity> NameCx() throws Exception {
		
		return po.nameCx();
	}


	


	public boolean name1Cx(String name) throws Exception {
		Easybuy_userentity test=  po.name1Cx(name);
		if(test!=null){
			return true;
		}
		return false;
	}


	public boolean ZcUser1(Easybuy_userentity1 user) throws Exception {
		
		  if( po.zhuce1(user)>0){
			  return true;
		  }		
		  return false;
	}

	@Override
	public boolean Zctpaper(TpaperSt tpaperSt) throws Exception {

          if(po.tpaperSt(tpaperSt)>0){return  true;}else {return  false;}


	}

}
