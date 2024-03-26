package cn.edu.lntu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.lntu.domain.Menu;
import cn.edu.lntu.mapper.MenuMapper;

@Service
public class MenuServiceImp implements MenuService {
	@Autowired
	private MenuMapper menuMapper;
	@Override
	public List<Menu> getMenus(String menuRight) {
		// TODO Auto-generated method stub
		return menuMapper.getMenus(menuRight);
	}

}
