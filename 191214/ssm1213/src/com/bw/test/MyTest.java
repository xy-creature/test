package com.bw.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.mapper.MyMapper;
import com.bw.pojo.City;
import com.bw.pojo.QueryModel;
import com.bw.service.MyService;

public class MyTest {
	@Test
	public void test(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		MyMapper m = ctx.getBean(MyMapper.class);
		System.out.println(m);
	}
	@Test
	public void test2(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		MyService s = ctx.getBean(MyService.class);
		List<City> allCity = s.allCity();
		System.out.println(allCity);
	}
	@Test
	public void test3(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		MyService s = ctx.getBean(MyService.class);
		s.deleteCity(6L);
	}
	@Test
	public void test4(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		MyService s = ctx.getBean(MyService.class);
		System.out.println(s.allCountry());
	}
	@Test
	public void test5(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		MyService s = ctx.getBean(MyService.class);
		s.saveCity(new City("柏林",1234,new Date(),3L));
	}
	@Test
	public void test6(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		MyService s = ctx.getBean(MyService.class);
		City c = s.getCityById(12L);
		System.out.println(c);
	}
	@Test
	public void test7(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		MyService s = ctx.getBean(MyService.class);
		QueryModel m = new QueryModel();
		m.setKey("海");
		m.setStart("2019-12-01");
		m.setEnd("2019-12-10");
		List<City> list = s.queryCity(m);
		for(City c:list){
			System.out.println(c.getName()+" "+c.getBirthday());
		}
	}
}
