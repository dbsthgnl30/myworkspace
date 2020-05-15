package com.naver;

public class Hero {
	private Weapon[] weapons;
	private Weapon hasWeapon;
	
	public Hero() {
		weapons = new Weapon[] {new Bow("bow", 1), new Sword("sword", 3)};
	}

	public Hero(Weapon[] weapons,int idx) {
		super();
		this.weapons = weapons;
		this.hasWeapon = weapons[idx];
	}
	
	public void attack(Monster m) {
		hasWeapon.attack(m);
	}
	
	public void changeWeapon(int idx) throws NoHaveWeaponException  {
		if(idx >= weapons.length) {
			throw new NoHaveWeaponException();
		}
		hasWeapon  = weapons[idx];
		System.out.println("무기를 변경합니다");
	}

	public Weapon[] getWeapons() {
		return weapons;
	}

	public void setWeapons(Weapon[] weapons) {
		this.weapons = weapons;
	}

	public Weapon getHasWeapon() {
		return hasWeapon;
	}

	public void setHasWeapon(Weapon hasWeapon) {
		this.hasWeapon = hasWeapon;
	}
	
	
	
	
	
}
