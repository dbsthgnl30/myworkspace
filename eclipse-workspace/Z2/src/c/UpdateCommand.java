package c;

import java.util.Scanner;

import com.naver.DB;
import com.naver.MemberDTO;

import co.kr.ca.Command;

public class UpdateCommand implements Command {

	@Override
	public void go(Scanner sc) {
		 
		System.out.println("수정할 아이디를 입력하세요");
		String id = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, null, -2);
		boolean isMember = DB.db.contains(dto);
		
		if (isMember) {
			System.out.println("변경할 이름을 입력하세요");
			String rename = sc.nextLine();
			
			System.out.println("변경할 나이를 입력하세요");
			int reage = sc.nextInt();
			
			dto.setName(rename);
			dto.setAge(reage);
			
			int idx = DB.db.indexOf(dto);
			DB.db.set(idx, dto);
		} else {
			System.out.println("회원이 아닙니다.");
		}
		
		
		
	}

}
