package cn.edu.lntu.domain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.lntu.mapper.MenuMapper;
import cn.edu.lntu.mapper.UserMapper;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/application-config.xml");
		SqlSessionFactory sqlSessionFactory=(SqlSessionFactory)ctx.getBean("sqlSessionFactory");
		SqlSession session=sqlSessionFactory.openSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		User user=mapper.getUser("sa");
		System.out.println(user.getName());
		MenuMapper mmapper=session.getMapper(MenuMapper.class);
		List<Menu> menus=mmapper.getMenus("0");
		for(Menu menu:menus)
			System.out.println(menu.getMenuName());
		session.close();	
	}
}
