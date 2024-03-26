package cn.edu.lntu.mapper;

import java.util.List;

import cn.edu.lntu.domain.User;

public interface UserMapper {
	public User getUser(String no);
	public List<User> getUsers();
}
