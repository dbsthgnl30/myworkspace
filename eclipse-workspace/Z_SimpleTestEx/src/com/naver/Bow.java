package com.naver;

public class Bow extends Weapon {
	
	public Bow() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Bow(String name, int attackPower) {
		super(name, attackPower);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void attackOfWhat() {
		System.out.println("활로 공격합니다.");
		
	}
}
