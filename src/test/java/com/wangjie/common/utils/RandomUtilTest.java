package com.wangjie.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test//返回一个随机整数
	public void testRandom() {
		int i = RandomUtil.random(1, 3);
		System.out.println(i);
	}

	@Test//返回一个随机整数的数组
	public void testSubRandom() {
		int[] i = RandomUtil.subRandom(1, 10, 3);
		for (int j : i) {
			System.out.println(j);
		}
	}

	@Test
	public void testRandomCharacter() {
		char i = RandomUtil.randomCharacter();
		System.out.println(i);
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(6);
		System.out.println(string);
	}

}
