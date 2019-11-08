package com.hb.service;

import java.util.List;

import com.hb.entity.Easybuy_userentity;
import com.hb.entity.Easybuy_userentity1;
import com.hb.entity.TpaperSt;

public interface Easybuy {
     public boolean ZcUser(Easybuy_userentity user) throws Exception;
     public List<Easybuy_userentity> NameCx() throws Exception;
     public  boolean name1Cx(String name) throws Exception;
     public boolean ZcUser1(Easybuy_userentity1 user) throws Exception;
     public boolean Zctpaper(TpaperSt tpaperSt) throws Exception;
}
