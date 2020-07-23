package com.banmajio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banmajio.bean.User;
import com.banmajio.mapper.UserMapper;

@RestController
public class UserController {

	@Autowired
	private UserMapper mapper;

	@RequestMapping("/select")
	public List<User> select() {
		return mapper.getUser();
	}

	@RequestMapping("/insert")
	public int insert(User user) {
		return mapper.insertUser(user);
	}

	@RequestMapping("/update")
	public int update(User user) {
		return mapper.updateUser(user);
	}

	@RequestMapping("/delete")
	public int delete(String name) {
		return mapper.deleteUser(name);
	}
}
