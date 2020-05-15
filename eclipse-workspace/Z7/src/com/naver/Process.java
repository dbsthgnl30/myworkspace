package com.naver;

import java.util.Scanner;

import a.InsertCommand;
import b.SelectCommand;
import c.UpdateCommand;
import d.DeleteCommand;
import kr.co.ca.Command;

public class Process {
	public Process() {
		
		Command[] command = {new InsertCommand(), 
							new SelectCommand(),
							new UpdateCommand(),
							new DeleteCommand()
							};
		
		
		boolean isTrue = true;
		int menu = -1;
		
		Scanner scan = new Scanner(System.in);
		
		while (isTrue) {
			System.out.println("메뉴입력");
			System.out.println("0 입력, 1 조회, 2 수정, 3 삭제, 4 종료");
			
			menu = scan.nextInt();
			scan.nextLine();
			
			if (menu < command.length) {
				command[menu].execute(scan);
			} else {
				isTrue = false;
			}
			
			
		}
		
		System.out.println("종료합니다");
		scan.close();
		
		
		
	}
}
