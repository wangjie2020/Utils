package com.wangjie.common.utils;

import java.util.Collection;
import java.util.List;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: 集合的处理类
 * @author: dell
 * @date: 2020年3月26日 上午10:46:06
 */
public class CollectionUtil {
	/**
	 * @Title: hasValue 
	 * @Description: 判断集合是否有值
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection==null && collection.isEmpty();
		
	}
}
