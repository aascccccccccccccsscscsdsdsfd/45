package cn.edu.lntu.service;

import java.util.List;

import cn.edu.lntu.domain.User;

public interface UserService {
	public User getUser(String no);
	public List<User> getUsers();
}
