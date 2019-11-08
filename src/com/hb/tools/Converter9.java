package com.hb.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class Converter9 implements Converter<String, Date> {

	
	public Date convert(String arg0) {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d=df.parse(arg0);
			return d;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
