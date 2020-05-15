package co.kr.ca;

import java.util.Scanner;

import com.naver.DB;

import a.InsertCommand;
import b.SelectCommand;
import c.UpdateCommand;
import d.DeleteCommand;

public class Process {
	public Process() {
		Command[] command = {new InsertCommand(),
							new SelectCommand(),
							new UpdateCommand(), 
							new DeleteCommand()
							};
		
		boolean isTrue = true;
		int menu = -1;
		
		Scanner scanner = new Scanner(System.in);
		
		while (isTrue) {
			System.out.println("메뉴를 선택하시오");
			System.out.println("0 입력, 1 조회, 2 수정, 3 삭제, 4. 종료");
			
			menu = scanner.nextInt();
			scanner.nextLine();
			
			if (menu < command.length) {
				
				command[menu].go(scanner);
				
			} else {
				isTrue = false;
			}
			
			
			
			
		}
		
		System.out.println("시스템종료");
		scanner.close();
		
		
		
		

	}
}
