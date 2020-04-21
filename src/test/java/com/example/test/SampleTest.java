package com.example.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.User;
import com.example.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testSelect() {
		System.out.println("----这是一个测试查询案例----");
		List<User> list = userMapper.selectList(null);
		System.out.println("测试结果如下：");
		list.forEach(System.out::println);
	}
}
