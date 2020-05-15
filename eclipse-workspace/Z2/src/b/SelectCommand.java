package b;

import java.util.Scanner;

import com.naver.DB;
import com.naver.MemberDTO;

import co.kr.ca.Command;

public class SelectCommand implements Command {

	@Override
	public void go(Scanner sc) {
		
		for (int i =0; i < DB.db.size(); i ++) {
			MemberDTO dto = DB.db.get(i);
			
			System.out.println(dto);
		}
		
	}

}
