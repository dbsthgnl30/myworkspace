package a;

import java.util.Scanner;

import com.naver.MemberDAO;
import com.naver.MemberDTO;

import kr.co.ca.Command;

public class InsertCommand implements Command {
	@Override
	public void execute(Scanner sc) {
		System.out.println("아이디 입력");
		String id = sc.nextLine();
		
		System.out.println("이름 입력");
		String name = sc.nextLine();
		
		System.out.println("나이입력");
		String sAge = sc.nextLine();
		int age = Integer.parseInt(sAge);
		
		MemberDAO dao = new MemberDAO();
		dao.insert(new MemberDTO(id, name, age));
		
	}
}
