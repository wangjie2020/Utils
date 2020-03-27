package com.wangjie.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandomDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.set(2010, 0 , 1);
		Date date = DateUtil.randomDate(c.getTime(), new Date());
		System.out.println(sdf.format(date));
	}
	
	@Test
	public void testInitMonth() {
		Date date = DateUtil.getInitMonth(new Date(1000000000000000l));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	
	@Test
	public void testEndMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2019, 1 , 20);
		
		Date date = DateUtil.getEndMonth(new Date(1000000000000l));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	public void testGetAge() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 1, 20);
		int i = DateUtil.getAgeByBirthday(c.getTime());
		System.out.println(i);
	}
	
}
