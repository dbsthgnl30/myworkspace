package a;

import java.util.Scanner;

import kr.co.ca.Command;
import kr.co.ca.DB;
import kr.co.ca.MemberDto;

public class InsertCommand implements Command{
	@Override
	public void go(Scanner sc) {
		System.out.println("아이디 입력");
		String id =  sc.nextLine();
		
		System.out.println("이름 입력");
		String name =  sc.nextLine();
		
		System.out.println("아이디 입력");
		int age=  sc.nextInt();
		sc.nextLine();
		
		
		
		DB.db.add(new MemberDto(id, name, age));
		
	}
}
