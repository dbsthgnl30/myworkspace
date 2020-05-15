package kr.co.ca;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Hammer;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.NoHaveWeaponException;
import com.naver.Sword;
import com.naver.Weapon;

public class Process2 {
	public Process2() {
		
		Monster m = new Monster(200);
		
		Weapon[] basicWeapon = new Weapon[] {new Bow("bow", 10), new Sword("sword", 20), new Hammer("hammer", 30)};
		
		int hasWeaponIdx = 0;
		Hero fighter = new Hero(basicWeapon, hasWeaponIdx);
		
		Scanner sc = new Scanner(System.in);
		boolean isTrue= true;
		
		while (isTrue) {
			System.out.println("메뉴입력");
			System.out.println("1 공격/ 2 무기변경/ 3 종료");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				fighter.attack(m);
				break;
			case 2:
				System.out.println("무기목록을 보여줄테니 무기를 선택하시오");
				int idx = 0;
				for(Weapon w : basicWeapon) {
					System.out.print( idx++ + " : " + w);
					
					if (idx < basicWeapon.length) {
						System.out.print(",");
					}
				}
				System.out.println();
				hasWeaponIdx = sc.nextInt();
				sc.nextLine();
				
				try {
					fighter.changeWeapon(hasWeaponIdx);
				} catch (NoHaveWeaponException e) {
					System.out.println("무기변경실패");
					e.printStackTrace();
				}
				
				
				break;

			default:
				isTrue = false;
				break;
			}
			
			
		}
		
		
		System.out.println("종료");
		sc.close();
		
		
		
		
		
	}
}
