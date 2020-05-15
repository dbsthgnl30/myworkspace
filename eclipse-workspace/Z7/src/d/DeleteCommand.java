package d;

import java.util.Scanner;

import com.naver.DB;
import com.naver.MemberDTO;

import kr.co.ca.Command;

public class DeleteCommand implements Command {
	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("삭제할 아이디 입력");
		String id = sc.nextLine();
		
		
		boolean isOk =  DB.db.remove(new MemberDTO(id, null, -1));
		
		if (isOk) {
			System.out.println("삭제되었습니다. ");
		} else {
			System.out.println("회원이 아닙니다. ");
		}
	}
}