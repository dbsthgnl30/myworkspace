package d;

import java.util.Scanner;

import com.naver.DB;
import com.naver.MemberDTO;

import co.kr.ca.Command;

public class DeleteCommand implements Command {

	@Override
	public void go(Scanner sc) {
		System.out.println("삭제할 회원의 아이디를 입력하세요");
		String id = sc.nextLine();
		
		boolean isOk = DB.db.remove(new MemberDTO(id, null, -1));
		
		if (isOk) {
			System.out.println("회원탈퇴 되었습니다");
		} else {
			System.out.println("회원이 아닙니다");
		}
		
	}

}
