package com.wangjie.common.utils;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testReadFile2List() {
		InputStream bf = this.getClass().getResourceAsStream("/data.txt");
	}

}
