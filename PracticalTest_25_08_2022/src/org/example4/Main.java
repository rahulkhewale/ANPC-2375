package org.example4;

import org.question4.Gun;

public class Main {

	public static void main(String[] args) {
		Gun gun = new Gun();
		Knife knife = new Knife();
		Sword sword = new Sword();
		
		gun.attackMethod();
		knife.attackMethod();
		sword.attackMethod();
	}
}
