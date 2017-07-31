package com.apts.yongjie.springTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yongjie.impl.HelloImpl;
import com.yongjie.infa.HelloApi;

public class SpringTest {
	@Test
	public void helletest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloApi ha = (HelloApi) context.getBean("hello");
		ha.helloWorld();
	}

}
