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
public class Romuald extends Hero implements ICombat{
	
	//initialisation des statistiques de la classe guerrier
	private final static int ARMOR = 1500;
	private final static int POWER = 250;
	private final static int LIFE = 1500;
	private final static int HEAL = 200;
	private final static String CLASSNAME = "Romuald";
	
	public Romuald() {
		super(Romuald.LIFE, Romuald.POWER, Romuald.ARMOR, Romuald.CLASSNAME);
	}
	
	//création d'une instance épée
	Epee stuff = new Epee();
	
	//calcul des dommages lors d'une attaque
	public int getDamage () {
		 return (this.puissance + stuff.getDegats());
	}
	
	//méthode de applyDamage
	public int applyDamage(int appliedDmg) {
		//ajout d'un heal
		if (Math.random() <= 0.2 ) {
			appliedDmg = 0 - HEAL;
			System.out.println("==> Romuald se soigne ! <==");
		} else {
			
		appliedDmg = appliedDmg;
		if (appliedDmg < 0) {
			appliedDmg = 0;
		}
		
		}
		this.vie = this.vie - appliedDmg;
		return this.vie;
		}
	
	//création de la commande taper
	public void taper () {
		System.out.println("Je suis un " + this.CLASSNAME + " et je fais " + this.getDamage() + " de dommage par coup.");
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getArmure() {
		return armure;
	}

	public void setArmure(int armure) {
		this.armure = armure;
	}
			
}
