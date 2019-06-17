package com.jiachengyu.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		System.out.println(RandomUtil.random(1, 3));
	}

	@Test
	public void testSubRandom() {
		System.out.println(RandomUtil.subRandom(11, 25, 4));
	}

	@Test
	public void testRandomCharacter() {
		System.out.println(RandomUtil.randomCharacter());
	}

	@Test
	public void testRandomString() {
		System.out.println(RandomUtil.randomString(4));
	}

}
