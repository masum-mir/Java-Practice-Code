package com.socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	
	public static void main(String[] args) {
		
		
		try(ServerSocket s = new ServerSocket(66)) {
		
			Socket so = s.accept();
			
			DataInputStream dis = new DataInputStream(so.getInputStream());
			String str = dis.readUTF();
			
			System.out.println("message:: "+ str);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
