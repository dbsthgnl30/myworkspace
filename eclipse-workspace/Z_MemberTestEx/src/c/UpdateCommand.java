package c;

import java.util.Scanner;

import com.naver.DB;
import com.naver.MemberDTO;

import kr.co.ca.Command;

public class UpdateCommand implements Command{
	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("수정할 아이디 입력");
		String id = sc.nextLine();
		
		
		MemberDTO dto = new MemberDTO(id, null, -1);
		boolean isMember = DB.db.contains(dto);
		
		if (isMember) {
			System.out.println("수정할 이름입력");
			String name = sc.nextLine();
			
			System.out.println("수정할 나이 입력");
			int age = sc.nextInt();
			sc.nextLine();
			
			dto.setName(name);
			dto.setAge(age);
			
			int idx =  DB.db.indexOf(dto);
			DB.db.set(idx, dto);
			
			
			
		} else {
			System.out.println("회원이 아닙니다. ");
		}
		
		
		
	}
}
