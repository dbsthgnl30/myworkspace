package b;

import java.util.List;
import java.util.Scanner;

import kr.co.hw.Command;
import kr.co.hw.DB;
import kr.co.hw.MemberDTO;

public class SelectCommand implements Command{
	@Override
	public void exec(Scanner sc) {
		
		List<MemberDTO> list = DB.db;
		
		for(int i =0; i < list.size(); i ++) {
			MemberDTO dto = list.get(i);
					
			System.out.println(dto);
			
			System.out.print(dto.getId());
			System.out.print(dto.getName());
			System.out.println(dto.getAge());
					
		}
		
		
	}
	
	
}
