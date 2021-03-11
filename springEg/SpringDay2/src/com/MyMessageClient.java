package com;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMessageClient {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("myBeans.xml");
		MessageSource msg=(MessageSource)ctx.getBean("mSource");
		Locale l=new Locale("eu", "FR");
		String message=msg.getMessage("welcome.message",new Object[]{"Saurabh","Pavan"}, l);
		System.out.println(message);
	}

}
