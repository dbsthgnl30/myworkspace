package com.naver;

import java.util.Scanner;

import a.InsertCommand;
import b.SelectAllCommand;
import c.UpdateCommand;
import d.DeleteCommand;
import kr.co.ca.Command;

public class Process {
	public Process() {
		Command[] commands = {new InsertCommand(), new SelectAllCommand(), new UpdateCommand(), new DeleteCommand()};
		boolean isTrue = true;
		int menu = -1;
		
		Scanner sc = new Scanner(System.in);
		while (isTrue) {
			System.out.println("메뉴입력");
			System.out.println("0 입력, 1 조회, 2 수정, 3 삭제, 4 종료");
			menu = sc.nextInt();
			
			if(menu < commands.length) {
				commands[menu].execute(sc);
			} else {
				isTrue = false;
			}
			
		}
		
		
		
		
		
		sc.close();
	}
}
