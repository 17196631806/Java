package com.dw.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class JsonUtils {

	public static Gson getGson() {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setDateFormat("yyyy-MM-dd HH:mm:ss");
		Gson GSON = gsonBuilder.create();
		return GSON;
	}
	
	/**
	 * 功能描述：对象转发成json
	 */
	public static String toJson(Object obj) {
		return getGson().toJson(obj);
	}
	
}
