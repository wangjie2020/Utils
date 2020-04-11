package com.wangjie.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest2 {

	@Test
	public void testIsEmail() {
		String str="1111111@qq.com";
		boolean email = StringUtil.isEmail(str);
		System.out.println(email);
	}

	@Test
	public void testIsPhoneNumber() {
		String str="13545678990";
		boolean phoneNumber = StringUtil.isPhoneNumber(str);
		System.out.println(phoneNumber);
	}

	@Test
	public void testIsNumber() {
		String str="3.1415926535897932a";
		boolean number = StringUtil.isNumber(str);
		System.out.println(number);
	}

}
