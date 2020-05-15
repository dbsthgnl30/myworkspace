package com.naver;

import java.util.Scanner;

import a.InsertC;
import b.SelectC;
import c.UpdateC;
import d.DeleteC;
import kr.co.ca.Command;

public class Process {
	public Process() {
		
		Command[] co = {new InsertC(), 
						new SelectC(),
						new UpdateC(),
						new DeleteC()
						};
		
		boolean isTrue = true;
		int menu = -1;
		
		Scanner s = new Scanner(System.in);
		
		while (isTrue) {
			System.out.println("메뉴");
			System.out.println("0 입력, 1 조회, 2 수정, 3 삭제, 4 종료");
			
			menu = s.nextInt();
			s.nextLine();
			
			if (menu < co.length) {
				co[menu].go(s);
			} else {
				isTrue = false;
			}
			
			
		}
		
		System.out.println("시스템 종료");
		s.close();
		
		
		
	}
}
