package com.naver;



import java.util.Scanner;

import kr.co.ca.Command;

public class Process {
	public Process() {
		Command[] commands = {new in	
				
		};
		boolean isTrue = true;
		int menu = -1;
		
		Scanner sc = new Scanner(System.in);
		
		while (isTrue) {
			System.out.println("메뉴입력");
			System.out.println("0 로그인, 1 예매, 2 결제, 3 조회");
			menu = sc.nextInt();
			sc.nextLine();
			if(menu< commands.length) {
				commands[menu].execute(sc);
			} else {
				isTrue = false;
			}
			
			
		}
		
		
		sc.close();
	}
}
