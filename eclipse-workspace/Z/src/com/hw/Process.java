package com.hw;

import java.util.Scanner;

import a.InsertCommand;
import b.SelectCommand;
import c.UpdateCommand;
import d.DeleteCommand;
import kr.co.hw.Command;

public class Process {
	public Process() {
		
		Command[] command = {new InsertCommand(), 
							new SelectCommand(),
							new UpdateCommand(),
							new DeleteCommand()
							};
		
		boolean isTrue = true;
		int menu = -1;
		
		Scanner sc = new Scanner(System.in);
		
		while (isTrue) {
			System.out.println("메뉴를 선택하기오");
			System.out.println("0 : 입력, 1 : 조회, 3 : 수정, 4 : 삭제, 5 : 종료");
			
			menu = sc.nextInt();
			sc.nextLine();
			
			if (menu < command.length) {
				command[menu].exec(sc);
			} else {
				isTrue = false;
			}
			
			
			
		}
		
		System.out.println("시스템종료");
		sc.close();
		
		
		
		
		
		
		
	}
}
