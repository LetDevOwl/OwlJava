package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseBallClient {
	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 5298;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);

		try {
			Socket socket = new Socket(address, port);
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			System.out.println("게임 준비 완료");
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);

			while (true) {
				System.out.print("--> ");
				String input = sc.nextLine();
				// 입력한거 보내주기
				dos.writeUTF(input);
				dos.flush();
				// 보낸거 받아주기

				String recvMsg = dis.readUTF();
				System.out.println(recvMsg);
//				if(recvMsg.equals("3스트라이크 0볼")) {
				if(recvMsg.startsWith("3")) {
					System.out.println("축하합니다. 맞췄습니다.");
					break;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
