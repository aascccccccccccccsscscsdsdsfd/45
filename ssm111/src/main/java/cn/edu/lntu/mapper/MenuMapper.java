package cn.edu.lntu.mapper;

import java.util.List;

import cn.edu.lntu.domain.Menu;

public interface MenuMapper {
	public List<Menu> getMenus(String menuRight);
}
