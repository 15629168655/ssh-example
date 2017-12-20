package test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssh.dao.UserDAO;
import com.ssh.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class test {
	@Resource
	private UserDAO userDAO;
	
//	@Test
//	public void testUserAdd(){
//		User user  = new User();
//		user.setUlogin("lwb");
//		user.setUname("李文滨");
//		user.setUpassword("123456");
//		user.setUphone("14529168655");
//		user.setUsex(1);
//		user.setUcategory(1);
//		user.setUstate(1);
//		userDAO.add(user);
//	}
	
//	@Test
//	public void testGetUserById(){
//		System.out.println("--user--"+userDAO.getById(2));
//	}
	
//	@Test
//	public void testUpdateUser(){
//		User user  = new User();
//		user.setUid(14);
//		user.setUlogin("lwb");
//		user.setUname("李文滨");
//		user.setUpassword("123456");
//		user.setUphone("15629168655");
//		user.setUsex(0);
//		user.setUcategory(0);
//		user.setUstate(0);
//		userDAO.update(user);
//	}
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO userDAO = context.getBean("userDAO",UserDAO.class);
		System.out.println("--userDAO--"+userDAO);
	}
}
