package kr.co.ca;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Hammer;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.NoHaveWeaponException;
import com.naver.Sword;
import com.naver.Weapon;

public class Process {
	public Process() {
		// TODO Auto-generated constructor stub
		Monster m = new Monster(200);
		
		Weapon[] basicWeapons = {new Bow("bow", 1), new Sword("sword", 4), new Hammer("hammer", 6)};
		int hasWeaponIdx = 0;
		Hero fighter = new Hero(basicWeapons , hasWeaponIdx);
		
		//Scanner 객체 생성 
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("메뉴 선택");
			System.out.println("1 공격, 2 무기변경, 3 종료");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			
			switch (menu) {
			case 1:
				fighter.attack(m);
				break;
				
			case 2:
				System.out.println("무기를 선택하세요");
				int idx= 0;
				for(Weapon w : basicWeapons) {
					System.out.print(idx++ + " : " + w);					
					
					if(idx< basicWeapons.length) { //마지막에 , 안찍어주려고
						System.out.print("  ,  ");
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
		
		sc.close();
		
	}
}
