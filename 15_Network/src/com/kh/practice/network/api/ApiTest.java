package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {
	public static void main(String[] args) {
		try {
			// 0) 홈페이지에서 요청주소, 요청변수 확인후 필수값에 해당하는 변수 초기화
			// serviceKey를 제외한 필수데이터는 샘플데이터를 추가한다
			String serviceKey = "0tKhNngsGtEi3Bc26iLbgR6OZ9I812DgliOvIibqmILfTTRJ1DpW3wDNBa1q2YLD1HO4VPHHVQMzKjazeCHpZA%3D%3D";
			String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";
			String stationName = URLEncoder.encode("종로구", "UTF-8");
			String dataTerm = "DAILY";

			serviceUrl += "?serviceKey=" + serviceKey
					   + "&stationName=" + URLEncoder.encode("종로구", "UTF-8")
					   + "&dataTerm=" + dataTerm;

			// 1) URL 객체 생성
			URL url = new URL(serviceUrl);

			// 2)URLConnection 객체 생성
			URLConnection conn = url.openConnection();

			// 3)입력 스트림 생성
			try (BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream()))) {
					
				// 4)전달받은 데이터를 화면에 출력
				String line = null;
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
