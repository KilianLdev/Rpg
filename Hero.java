/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author kilianl
 */
//class mere
public class Hero {

	protected int vie = 0;
	protected int puissance = 0;
	protected int armure = 0;
	protected String nomClasse = "";
	
	public Hero(int v, int p, int a, String n) {
		this.vie = v;
		this.puissance = p;
		this.armure = a;
		this.nomClasse = n;
	}
	
	//calcul de la résistance du personnage
	public int getHp() {
		return (this.vie + this.armure);
	}
	
	public void taper() {
		System.out.println("Je tape");
	}
}
