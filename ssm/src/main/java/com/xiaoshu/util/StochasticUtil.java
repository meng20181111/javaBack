package com.xiaoshu.util;

import java.util.UUID;

public class StochasticUtil {

	/**
	 * 生成随机UUID
	 * @return
	 */
	public static String getUUID(){
		UUID uuid = UUID.randomUUID();
//		System.out.println("uuid="+uuid);
		return uuid.toString().replaceAll("-", "");
	}
	
	/**
	 * 根据字符串生成固定uuid
	 * @param name
	 * @return
	 */
	public static String getUUID(String name){
		UUID uuid=UUID.nameUUIDFromBytes(name.getBytes());
	    return uuid.toString().replace("-", "");
	}
	
	public static void main(String[] args) {
		String str= StochasticUtil.getUUID();
		System.out.println(str);
	}
}
