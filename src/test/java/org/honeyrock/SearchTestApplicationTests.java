package org.honeyrock;

import org.honeyrock.mapper.SearchMapper;
import org.honeyrock.mapper.SimpleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.Setter;
import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class SearchTestApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Setter(onMethod_ = @Autowired)
	private SearchMapper mapper;
	
	
	@Test
	public void searchTest() {
		String keyword = "제";
		log.info("" + mapper.searchPoint(keyword));
		
	}
	
	@Test
	public void searchNameTest() {
		log.info("" + mapper.getPointName());
		
	}
	
	@Setter(onMethod_ = @Autowired)
	private SimpleMapper simpleMapper;
	
	@Test
	public void getListTest() {
		log.info("" + mapper.getList());
		
	}
	
}
