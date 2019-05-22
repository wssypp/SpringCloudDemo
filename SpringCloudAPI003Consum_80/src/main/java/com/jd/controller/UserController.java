package com.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jd.pojo.TbUser;

@RestController
public class UserController {
	
	private final String REST_URL="http://localhost:8001";
	
	@Autowired
	private RestTemplate restTemp;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/Users")
	public List<TbUser> getUsers(){
		return restTemp.getForObject(REST_URL+"/Users", List.class);
	}
	
	
}
