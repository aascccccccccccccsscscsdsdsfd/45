package cn.edu.lntu.service;

import java.util.List;

import cn.edu.lntu.domain.Menu;

public interface MenuService {
	public List<Menu> getMenus(String menuRight);
}
