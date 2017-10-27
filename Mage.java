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
public class Mage extends Hero implements ICombat{
	
	//initialisation des statistiques de la classe mage
	private final static int ARMOR = 1000;
	private final static int POWER = 50;
	private final static int LIFE = 1000; 
	private final static String CLASSNAME = "mage";
	
	public Mage() {
		super(Mage.LIFE, Mage.POWER, Mage.ARMOR, Mage.CLASSNAME);
	}
	
	//création d'une instance batonMagique
	BatonMagique stuff = new BatonMagique();
	
	//calcul des dommages lors d'une attaque
	public int getDamage () {
		return (this.puissance + stuff.getDegat());
	}
	
	//méthode de applyDamage
		public int applyDamage(int appliedDmg) {
			appliedDmg = appliedDmg;
			if (appliedDmg < 0) {
				appliedDmg = 0;
			}
			this.vie = this.vie - appliedDmg;
			return this.vie;
		}
		//methode pour montrer une surcharge
		/*public float applyDamage ( float appliedDmg) {
			appliedDmg = appliedDmg;
			if (appliedDmg < 0) {
				appliedDmg = 0;
			}
			this.vie = this.vie - appliedDmg;
			return this.vie;
		}*/
	
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