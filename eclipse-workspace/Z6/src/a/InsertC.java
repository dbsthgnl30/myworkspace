package a;

import java.util.Scanner;

import kr.co.ca.Command;
import kr.co.ca.DB;
import kr.co.ca.MemberDTO;

public class InsertC implements Command{
	@Override
	public void go(Scanner sc) {
		System.out.println("아이디입력");
		String id = sc.nextLine();
		
		System.out.println("이름입력");
		String name = sc.nextLine();
		
		System.out.println("나이입력");
		int age = sc.nextInt();
		sc.nextLine();
		
		DB.db.add(new MemberDTO(id, name, age));
		
		
	}
}