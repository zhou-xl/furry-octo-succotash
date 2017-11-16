package com;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class JsonToMapTest {

	
	 @SuppressWarnings("rawtypes")
	public static void main(String[] args){  
		  
	        String str = "{\"0\":\"zhangsan\",\"1\":\"lisi\",\"2\":\"wangwu\",\"3\":\"maliu\"}";  
	        //��һ�ַ�ʽ  
	        Map maps = (Map)JSON.parse(str);  
	        System.out.println("�������JSON��������JSON�ַ���!!!");  
	        for (Object map : maps.entrySet()){  
	            System.out.println(((Map.Entry)map).getKey()+"     " + ((Map.Entry)map).getValue());  
	        }  
	        //�ڶ��ַ�ʽ  
	        Map mapTypes = JSON.parseObject(str);  
	        System.out.println("�������JSON���parseObject������JSON�ַ���!!!");  
	        for (Object obj : mapTypes.keySet()){  
	            System.out.println("keyΪ��"+obj+"ֵΪ��"+mapTypes.get(obj));  
	        }  
	        //�����ַ�ʽ  
	        Map mapType = JSON.parseObject(str,Map.class);  
	        System.out.println("�������JSON��,ָ���������ͣ�������JSON�ַ���!!!");  
	        for (Object obj : mapType.keySet()){  
	            System.out.println("keyΪ��"+obj+"ֵΪ��"+mapType.get(obj));  
	        }  
	        //�����ַ�ʽ  
	        /** 
	         * JSONObject��Map�ӿڵ�һ��ʵ���� 
	         */  
	        Map json = (Map) JSONObject.parse(str);  
	        System.out.println("�������JSONObject���parse����������JSON�ַ���!!!");  
	        for (Object map : json.entrySet()){  
	            System.out.println(((Map.Entry)map).getKey()+"  "+((Map.Entry)map).getValue());  
	        }  
	        //�����ַ�ʽ  
	        /** 
	         * JSONObject��Map�ӿڵ�һ��ʵ���� 
	         */  
	        JSONObject jsonObject = JSONObject.parseObject(str);  
	        System.out.println("�������JSONObject��parseObject����������JSON�ַ���!!!");  
	        for (Object map : json.entrySet()){  
	            System.out.println(((Map.Entry)map).getKey()+"  "+((Map.Entry)map).getValue());  
	        }  
	        //�����ַ�ʽ  
	        /** 
	         * JSONObject��Map�ӿڵ�һ��ʵ���� 
	         */  
	        Map mapObj = JSONObject.parseObject(str,Map.class);  
	        System.out.println("�������JSONObject��parseObject������ִ�з�������������JSON�ַ���!!!");  
	        for (Object map: json.entrySet()){  
	            System.out.println(((Map.Entry)map).getKey()+"  "+((Map.Entry)map).getValue());  
	        }  
	        String strArr = "{{\"0\":\"zhangsan\",\"1\":\"lisi\",\"2\":\"wangwu\",\"3\":\"maliu\"}," +  
	                "{\"00\":\"zhangsan\",\"11\":\"lisi\",\"22\":\"wangwu\",\"33\":\"maliu\"}}";  
	       // JSONArray.parse()  
	        System.out.println(json);  
	    }  
}
