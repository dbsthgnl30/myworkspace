package com.naver;

public class Hero {
	private Weapon[] weapons;
	private Weapon hasWeapon;
	
	public Hero() {
		weapons = new Weapon[] {new Bow("bow", 10), new Sword("sword", 20), new Hammer("hammer", 30)};
		hasWeapon = weapons[0];
	}

	public Hero(Weapon[] weapons, int idx) {
		super();
		this.weapons = weapons;
		this.hasWeapon = weapons[idx];
	}
	
	public void attack(Monster m) {
		hasWeapon.attack(m);
	}
	
	public void changeWeapon(int idx) throws NoHaveWeaponException {
		if(idx >= weapons.length) {
			throw new NoHaveWeaponException();
		}
		
		hasWeapon = weapons[idx];
		System.out.println("무기를 변경하였습니다. 현재무기" + hasWeapon);
	}
	
	
}
