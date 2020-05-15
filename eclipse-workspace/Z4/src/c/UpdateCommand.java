package c;

import java.util.Scanner;

import kr.co.ca.Command;
import kr.co.ca.DB;
import kr.co.ca.MemberDto;

public class UpdateCommand implements Command {
	@Override
	public void go(Scanner sc) {
		System.out.println("수정할 아이디?");
		String id = sc.nextLine();
		
		MemberDto dto = new MemberDto(id, null, -1);
	 	boolean isMember = DB.db.contains(dto);
	 	
	 	if (isMember) {
			System.out.println("이름을 입력");
			String name = sc.nextLine();
			
			System.out.println("나이를 입력");
			int age = sc.nextInt();
			sc.nextLine();
			
			dto.setName(name);
			dto.setAge(age);
			
			
			int idx = DB.db.indexOf(dto);
			DB.db.set(idx, dto);
			
			
			
		} else {
			System.out.println("회원이 아닙니다");
		}
		
	}
}
