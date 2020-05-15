package c;

import java.util.Scanner;

import kr.co.ca.Command;
import kr.co.ca.DB;
import kr.co.ca.MemberDTO;

public class Update implements Command{
	@Override
	public void go(Scanner sc) {
		System.out.println();
		
		MemberDTO dto = new MemberDTO(null, null, -1);
		boolean isMember =  DB.db.contains(dto);
		
		if (isMember) {
			System.out.println();
			
			System.out.println();
			
//			dto.setAge(age);
//			dto.setName(name);
			
			
			int idx =  DB.db.indexOf(dto);
			DB.db.set(idx, dto);
		}
	}
}
