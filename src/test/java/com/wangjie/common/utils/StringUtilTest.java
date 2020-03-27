package com.wangjie.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		//String str = null; //没值
		//String str = "";//没值
		//String str = " ";//有值
		String str ="abc";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		//String str = null; //没值
		//String str = "";//没值
		String str = " ";//有值
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		/*
		 * String string = StringUtil.randomChineseString(); System.out.println(string);
		 */
		String string = StringUtil.randomChineseString(10);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}

}
