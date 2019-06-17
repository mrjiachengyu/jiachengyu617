package com.jiachengyu.common.utils;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		System.out.println(StringUtil.hasLength(""));
	}

	@Test
	public void testHasText() {
		System.out.println(StringUtil.hasText("sd"));
	}

	@Test
	public void testRandomChineseString() {
		System.out.println(StringUtil.randomChineseString(2));
	}

	@Test
	public void testGenerateChineseName() {
		System.out.println(StringUtil.generateChineseName());
	}
	@Test
	public void getperson() {
		
		for(int i=0;i<10000;i++) {
			Person person=new Person(StringUtil.generateChineseName(), RandomUtil.random(1, 120), StringUtil.randomChineseString(140),new Date());

			System.out.println(person);
		}
		
	}

}
