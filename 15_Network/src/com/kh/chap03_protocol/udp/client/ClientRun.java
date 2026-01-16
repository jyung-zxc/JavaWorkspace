package com.kh.chap03_protocol.udp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClientRun {
	public static void main(String[] args) {
		try {
			InetAddress server = InetAddress.getByName("Localhost");
			int serverPort = 30001;
			
			//랜덤 포트번호 사용
			DatagramSocket socket = new DatagramSocket();
			String message = "데이터 전송 요청";
			byte[] sendData = message.getBytes();
			
			DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length,server,serverPort);
		
			socket.send(sendPacket);

			System.out.println("요청메세지 전송 후 데이터 수집");
			
			//요청 메세지 전송 후 데이터 수선 대기
			byte[] data = new byte[1024];
			
			DatagramPacket receiveData = new DatagramPacket(data, data.length);
			
			socket.receive(receiveData);
			
			String receive = new String(receiveData.getData(), 
					0, receiveData.getLength());
				
				System.out.println(receive);
				
				socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
