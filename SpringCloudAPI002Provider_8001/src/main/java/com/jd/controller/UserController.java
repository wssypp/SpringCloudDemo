package com.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jd.pojo.TbUser;
import com.jd.service.IUserService;

@RestController
public class UserController {
	@Autowired
	private IUserService userService;
	
	@GetMapping("/Users")
	public List<TbUser> getUsers(){
		return userService.selectByExample(null);
	}

}
