package a;

import java.util.Scanner;

import com.naver.DB;
import com.naver.MemberDTO;

import co.kr.ca.Command;

public class InsertCommand implements Command {

	@Override
	public void go(Scanner sc) {
		System.out.println("아이디를 입력하셈");
		String id = sc.nextLine();
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요");
		int age =  sc.nextInt();
		sc.nextLine();
		
		//DB.db.add(new MemberDTO(id, name, age));
		
		MemberDTO dto = new MemberDTO(id, name, age);
		DB.db.add(dto);
		
	}

}
