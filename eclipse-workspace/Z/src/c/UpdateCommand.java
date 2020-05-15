package c;

import java.util.Scanner;

import kr.co.hw.Command;
import kr.co.hw.DB;
import kr.co.hw.MemberDTO;

public class UpdateCommand implements Command {
	@Override
	public void exec(Scanner sc) {
		System.out.println("수정할 아이디를 입력하세요");
		String id = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, null, -1);
		boolean isMember = DB.db.contains(dto);
		
		if (isMember) {
			System.out.println("수정할 이름을 입력하세요");
			String rename = sc.nextLine();
			
			System.out.println("수정할 나이를 입력하세요");
			int reage= sc.nextInt();
			sc.nextLine();
			
			dto.setName(rename);
			dto.setAge(reage);
			
			int idx = DB.db.indexOf(dto);
			DB.db.set(idx, dto);
			
		} else {
			System.out.println("회원이 아닙니다");
		}
		
	}
}
