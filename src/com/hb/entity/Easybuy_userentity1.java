package com.hb.entity;


import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;


import com.hb.message.LoginTest.CheckLogin;





public class Easybuy_userentity1 {
	
	private int id;
	@NotBlank(groups={CheckLogin.class},message="用户名不能为空")//�ı�����Ϊ""
    private String loginName;
	@NotBlank(groups={CheckLogin.class},message="�û�������Ϊ��")
   private String userName;
	@NotEmpty(groups={CheckLogin.class},message="���벻��Ϊ��")
    private String password;
	@NotNull(groups={CheckLogin.class},message="�Ա���Ϊ��")//String�����ݿ��Զ�ת��ʽint
    private Integer sex;
	private String identityCode;
    private String email;
    private int type;
    private String catename;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
	

	public String getIdentityCode() {
		return identityCode;
	}
	public void setIdentityCode(String identityCode) {
		this.identityCode = identityCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}
}
