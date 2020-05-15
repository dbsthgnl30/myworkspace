package d;

import java.util.Scanner;

import kr.co.ca.Command;
import kr.co.ca.DB;
import kr.co.ca.MemberDTO;

public class DeleteCommand implements Command{
	@Override
	public void go(Scanner sc) {
		System.out.println("삭제할 아이디");
		String id = sc.nextLine();
		
		boolean isOk =  DB.db.remove(new MemberDTO(id, null, -1));
		
		if (isOk) {
			System.out.println("삭제됨");
		} else {
			System.out.println("회원이 아님 ");
		}
		
	}
}
