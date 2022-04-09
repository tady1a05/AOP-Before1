package com.toby.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
	public void addAccount() {
		System.out.println("Added the fucking account");
	}
}
