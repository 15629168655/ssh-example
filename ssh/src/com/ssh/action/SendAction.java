package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;

public class SendAction extends ActionSupport {
	public SendAction(){
		System.out.println("---SendAction---");
	}
	public String execute(){
		return "send";
	}
}
