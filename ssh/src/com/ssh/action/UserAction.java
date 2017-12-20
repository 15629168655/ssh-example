package com.ssh.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.dao.UserDAO;
import com.ssh.model.User;

public class UserAction extends ActionSupport {
	private UserDAO userDAO;
	private Integer uid;
	private String ulogin;
	private String uname;
	private String upassword;
	private String usex;
	private String uphone;
	private String ucategory;
	private String ustate;
	Map session = ActionContext.getContext().getSession();
	public String query(){
		List<User> list = userDAO.query();
		session.put("userList", list);
		return "showUser";
	}
	
	public String toEdit(){
		User user = userDAO.getById(this.getUid());
		session.put("editUser", user);
		return "editUser";
	}
	
	public String add(){
		User user = new User();
		user.setUlogin(this.getUlogin());
		user.setUname(this.getUname());
		user.setUpassword(this.getUpassword());
		user.setUsex(Integer.parseInt(this.getUsex()));
		user.setUphone(this.getUphone());
		user.setUcategory(Integer.parseInt(this.getUcategory()));
		user.setUstate(Integer.parseInt(this.getUstate()));
		userDAO.add(user);
		List<User> list = userDAO.query();
		session.put("userList", list);
		return "showUser";
	}
	
	public String update(){
		User user = new User();
		user.setUid(this.getUid());
		user.setUlogin(this.getUlogin());
		user.setUname(this.getUname());
		user.setUpassword(this.getUpassword());
		user.setUsex(Integer.parseInt(this.getUsex()));
		user.setUphone(this.getUphone());
		user.setUcategory(Integer.parseInt(this.getUcategory()));
		user.setUstate(Integer.parseInt(this.getUstate()));
		userDAO.update(user);
		List<User> list = userDAO.query();
		session.put("userList", list);
		return "showUser";
	}
	
	public String delete(){
		User user = new User();
		user.setUid(this.getUid());
		userDAO.delete(user);
		List<User> list = userDAO.query();
		session.put("userList", list);
		return "showUser";
	}
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public String getUlogin() {
		return ulogin;
	}
	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public void setUlogin(String ulogin) {
		this.ulogin = ulogin;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUsex() {
		return usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUcategory() {
		return ucategory;
	}

	public void setUcategory(String ucategory) {
		this.ucategory = ucategory;
	}

	public String getUstate() {
		return ustate;
	}

	public void setUstate(String ustate) {
		this.ustate = ustate;
	}
	
	
}
