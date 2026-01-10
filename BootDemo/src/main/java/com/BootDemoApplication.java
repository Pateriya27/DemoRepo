package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sbeans.EmpInfo;

@SpringBootApplication
public class BootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootDemoApplication.class, args);
		EmpInfo bean = ctx.getBean(EmpInfo.class);
		System.out.println(bean);
	}

}
