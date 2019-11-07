package com.bs.mall.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.bs.mall.pojo.BookList;
import com.bs.mall.pojo.BookTheme;
import com.bs.mall.service.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:springMvc.xml","classpath:applicationContext.xml"})
public class BookTest {
	@Resource
	private BookService bs;
	@Test
	public void bookServiceTest(){
		List<BookList> bookList = bs.getBookList(1);
		System.out.println(JSON.toJSONString(bookList));
	}
	
	@Test
	public void bookThemeTest(){
		BookTheme bookTheme = bs.getBookTheme(1);
		System.out.println("bookTheme的值为："+bookTheme);
	}
}
