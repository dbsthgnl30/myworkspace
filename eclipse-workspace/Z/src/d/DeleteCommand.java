package d;

import java.util.Scanner;

import kr.co.hw.Command;
import kr.co.hw.DB;
import kr.co.hw.MemberDTO;

public class DeleteCommand implements Command {
	@Override
	public void exec(Scanner sc) {
		System.out.println("삭제할 회원의 아이디를 입력하세요");
		String id = sc.nextLine();
		
		boolean isOk = DB.db.remove(new MemberDTO(id, null, -1));
		
		if (isOk) {
			System.out.println("탈퇴성공");
		} else {
			System.out.println("회원이 아닙니다");
		}
		
		
	}
}
