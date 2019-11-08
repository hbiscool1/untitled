package com.hb.dao;

import java.util.List;


import com.hb.entity.TpaperSt;
import org.apache.ibatis.annotations.Param;

import com.hb.entity.Easybuy_userentity;
import com.hb.entity.Easybuy_userentity1;

public interface EasybuyJK {
	public int zhuce(Easybuy_userentity q)throws Exception;
    public List<Easybuy_userentity> nameCx()throws Exception;
    public Easybuy_userentity name1Cx(@Param("Name")String userName)throws Exception;
    public int zhuce1 (Easybuy_userentity1 q)throws Exception;
    public int tpaperSt(TpaperSt user)throws Exception;
    
}
