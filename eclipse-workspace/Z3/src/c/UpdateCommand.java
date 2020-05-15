package c;

import java.util.Scanner;

import kr.co.ca.Command;
import kr.co.ca.DB;
import kr.co.ca.MemberDTO;

public class UpdateCommand implements Command{
	@Override
	public void go(Scanner sc) {
		
		System.out.println("수정할 id를 입력하세요");
		String reid = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(reid, null, -1);
		int idx = DB.db.indexOf(dto);
		
		switch (idx) {
		case 1:
			
			break; 
		case 2:
			
			break;

		default:
			break;
		}
		
//		if (isMember) {
//			System.out.println("이름을 입력하세요");
//			String rename = sc.nextLine();
//			
//			System.out.println("나이를 입력하세요");
//			int reage = sc.nextInt();
//			sc.hasNextLine();
//			
//			dto.setAge(reage);
//			dto.setName(rename);
//			
//			int idx = DB.db.indexOf(dto);
//			DB.db.set(idx, dto);
//		} else {
//			System.out.println("회원이 아닙니다");
//		}
		
	}
}
