package com.qa.swag.pages;

import java.util.Properties;

import com.microsoft.playwright.Page;


public class LoginPage   {
	
	Properties prop;
    // 1. Locators
	private Page page; 	
	public String Uid_field = "//*[@id='user-name']";
	public String pwd_field = "//*[@id='password']";
	public String logIn_btn = "//*[@name='login-button']";
	public String property_path = "/testdata/credentials.properties";
	public String err_msg_locked_out = "//*[@data-test='error' and contains(text(), 'Epic sadface: Sorry, this user has been locked out.')]";
	
	// 2. page constructor:
	public LoginPage(Page page) {
		this.page = page;
	}
	
	
	// 3. page actions/methods:
	public String getLoginPageTitle() {
		return page.title();
	}
	
}
