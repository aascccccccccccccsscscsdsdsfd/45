package cn.edu.lntu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.lntu.domain.User;
import cn.edu.lntu.mapper.UserMapper;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User getUser(String no) {
		// TODO Auto-generated method stub
		return userMapper.getUser(no);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userMapper.getUsers();
	}

}
