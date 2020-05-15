package a;

import java.util.Scanner;

import kr.co.hw.Command;
import kr.co.hw.DB;
import kr.co.hw.MemberDTO;

public class InsertCommand implements Command {
	@Override
	public void exec(Scanner sc) {
		System.out.println("아이디입력");
		String id = sc.nextLine();
	
		System.out.println("이름을 입력");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력");
		int age = sc.nextInt();
		sc.nextLine();
		
		DB.db.add(new MemberDTO(id, name, age));
		
		
		
	}
}
