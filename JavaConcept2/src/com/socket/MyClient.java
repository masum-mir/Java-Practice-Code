package com.socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
	
	public static void main(String[] args) {
		
		try(Socket s = new Socket("localhost", 66); DataOutputStream out = new DataOutputStream(s.getOutputStream())) {
			
			out.writeUTF("Hello server");
			out.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
