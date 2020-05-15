package c;

import java.util.Scanner;

import kr.co.ca.Command;
import kr.co.ca.DB;
import kr.co.ca.MemberDTO;

public class UpdateCommand implements Command{
	@Override
	public void go(Scanner sc) {
		System.out.println("수정할 아이디 입력");
		String id = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, null, -1);
		boolean isMember = DB.db.contains(dto);
		
		if (isMember) {
			System.out.println("수정할 이름 입력");
			String name= sc.nextLine();
			
			System.out.println("수정할 나이 입력");
			int age = sc.nextInt();
			sc.hasNextLine();
			
			dto.setAge(age);
			dto.setName(name);
			
			
			int idx = DB.db.indexOf(dto);
			DB.db.set(idx, dto);
			
			
		} else {
			System.out.println("회원이 아닙니다");
		}
		
		
	}
}
