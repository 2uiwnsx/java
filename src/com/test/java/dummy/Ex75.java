package com.test.java.dummy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Ex75 {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		
	}

	private static void m2() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[지하철 정보 검색]");
		
		System.out.print("역명을 입력하세요: ");
		String name = scan.nextLine();
		
		String url = "http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?";
		url += "serviceKey=iZ8x%2F3ft3nJNnO9FFzmYcmmN6gKK64i7RNRvz0Qc6abwjp6J8wbQIAJPZMPosKnPNeeMHTAhXTkTQ9TetaNaXg%3D%3D";
		url += "&pageNo=1";
		url += "&numOfRows=10";
		url += "&_type=json";
		url += "&subwayStationName=" + URLEncoder.encode(name);

		try {
			
			URL urlObj = new URL(url);
			
			HttpURLConnection conn = (HttpURLConnection)urlObj.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			
			BufferedReader reader = null;
			
			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				
			} else {
				
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
				
			}

			JSONParser parser = new JSONParser();
			
			JSONObject root = (JSONObject)parser.parse(reader);	
			
			JSONObject response = (JSONObject)root.get("response");	
			
			JSONObject body = (JSONObject)response.get("body");
			
			JSONObject items = (JSONObject)body.get("items");
			
			ArrayList<String> temp = new ArrayList<String>();
			
			if (items.get("item") instanceof JSONObject) {
				
				JSONObject item = (JSONObject)items.get("item");

				System.out.println("\n1.");
				System.out.println("노선명: " + item.get("subwayRouteName"));
				System.out.println("역명: " + item.get("subwayStationName"));
				
				temp.add(item.get("subwayStationId").toString());
				
			} else {
				
				JSONArray arr = (JSONArray)items.get("item");
				
				int n = 1;
				
				for (Object obj : arr) {
					
					JSONObject item = (JSONObject)obj;

					System.out.println("\n" + n + ".");
					System.out.println("노선명: " + item.get("subwayRouteName"));
					System.out.println("역명: " + item.get("subwayStationName"));
					
					n++;
					
					temp.add(item.get("subwayStationId").toString());
					
				}
				
			}

			reader.close();
			
			conn.disconnect();
			
			System.out.println("=========================");
			System.out.print("번호를 입력하세요: ");
			int num = scan.nextInt();
			
			url = "http://apis.data.go.kr/1613000/SubwayInfoService/getSubwaySttnExitAcctoCfrFcltyList?";
			url += "serviceKey=iZ8x%2F3ft3nJNnO9FFzmYcmmN6gKK64i7RNRvz0Qc6abwjp6J8wbQIAJPZMPosKnPNeeMHTAhXTkTQ9TetaNaXg%3D%3D";
			url += "&pageNo=1";
			url += "&numOfRows=10";
			url += "&_type=json";
			url += "&subwayStationId=" + temp.get(num - 1);
			
			urlObj = new URL(url);
			
			conn = (HttpURLConnection)urlObj.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			
			reader = null;
			
			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				
			} else {
				
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
				
			}
			
			root = (JSONObject)parser.parse(reader);
			
			response = (JSONObject)root.get("response");	
			
			body = (JSONObject)response.get("body");
			
			items = (JSONObject)body.get("items");
			
			if (items.get("item") instanceof JSONObject) {
				
				JSONObject item = (JSONObject)items.get("item");

				System.out.println("\n출구번호: " + item.get("exitNo"));
				System.out.println("시설명: " + item.get("dirDesc"));
				
			} else {
				
				JSONArray arr = (JSONArray)items.get("item");
				
				for (Object obj : arr) {
					
					JSONObject item = (JSONObject)obj;

					System.out.println("\n출구번호: " + item.get("exitNo"));
					System.out.println("시설명: " + item.get("dirDesc"));
					
				}
				
			}

			reader.close();
			
			conn.disconnect();
			
			scan.close();
			
		} catch (Exception e) {
			
			System.out.println("at Ex75.m2");
			
			e.printStackTrace();
			
		}

	}
	
	private static void m1() {
		
		String json = "{\r\n"
					+ "\"name\":\"홍길동\",\r\n"
					+ "\"age\":20,\r\n"
					+ "\"tel\":[\"010-1111-1111\",\"010-2222-2222\",\"010-3333-3333\"]\r\n"
					+ "}";
		
		JSONParser parser = new JSONParser();
		
		try {
			
			JSONObject obj = (JSONObject)parser.parse(json);
			
			System.out.println(obj.get("name"));
			System.out.println(obj.get("age"));
			
			JSONArray arr = (JSONArray)obj.get("tel");
			
			for (Object t : arr) {
				
				System.out.println(t);
				
			}
			
		} catch (ParseException e) {
			
			System.out.println("at Ex75.m1");

			e.printStackTrace();
			
		}
		
	}

}
