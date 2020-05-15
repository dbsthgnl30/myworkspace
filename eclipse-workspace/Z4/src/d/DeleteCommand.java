package d;

import java.util.Scanner;

import kr.co.ca.Command;
import kr.co.ca.DB;
import kr.co.ca.MemberDto;

public class DeleteCommand implements Command{
	@Override
	public void go(Scanner sc) {
		System.out.println("삭제할 회원 아이디?");
		String id = sc.nextLine();
		
		
		boolean isMember = DB.db.remove(new MemberDto(id, null, -1));
		
		if (isMember) {
			System.out.println("삭제됨");
		} else {
			System.out.println("회원이 아닙니다.");
		}
	}
}
