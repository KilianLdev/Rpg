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
import java.util.Scanner;

public class Main {

	public static void main (String [] args) {
		
		Hero hero1;
		Hero hero2;
		
		System.out.println("Veuillez sélectionner votre première classe (Romuald, Mage ou Assassin) : ");
		
		//création d'un champs de saisie pour les héros 
		Scanner key = new Scanner(System.in);
		
		//champs de saisie pour le héros 1
		String heroName1 = key.next();
		
		//séparation des deux classes
		System.out.println("------------------------------------------------------------------");
		System.out.println("Veuillez sélectionner votre seconde classe (Romuald, Mage ou Assassin) : ");
		
		//création d'un champs de saisie pour le héros 2
		String heroName2 = key.next();
		System.out.println("------------------------------------------------------------------");
		
		//création des héros
		hero1 = getPlayerClass(heroName1);
		hero2 = getPlayerClass(heroName2);
		
		//upcasting de Hero
		Hero heroname1 = (Hero) hero1;
		Hero heroname2 = (Hero) hero2;
		
		//gestion du type de personnage et affichage de ses attributs avec upcasting
		if (hero1 != null && hero2 != null) {
			/*if (hero1 instanceof Guerrier) {
				Hero Guerrier = (Guerrier) hero1;
				Guerrier.taper();
			} else if (hero1 instanceof Mage) {
				Hero Mage = (Mage) hero1;
				Mage.taper();
			} if (hero2 instanceof Guerrier) {
				Hero Guerrier = (Guerrier) hero2;
				Guerrier.taper();
			} else if (hero2 instanceof Mage) {
				Hero Mage = (Mage) hero2;
				Mage.taper();
			}*/
			
			if (hero1 instanceof ICombat && hero2 instanceof ICombat) {
				
				//récupération de la valeur des dommages pour les héros
				int dmg1 = ((ICombat)hero1).getDamage();
				int dmg2 = ((ICombat)hero2).getDamage();
				
				//début de la boucle pour répéter l'opération
				do {
					
					//affichage des phases d'attaques des héros
					
					//phase d'attaque du hero1
					System.out.println("(joueur1) " + heroName1 + " attaque (joueur2) " + heroName2 );
					
					//downcasting de hero2
					int shoot1 = ((ICombat)hero2).applyDamage(dmg1);
					System.out.println("Il reste " + hero2.getHp() + " PV à (joueur2) " + heroName2);

					//condition si les PV du hero2 arrivent à 0
					if(hero2.getHp() <= 0 ) {
						System.out.println("------------------------------------------------------------------");
						System.out.println(heroName2 + " (joueur2) est mort.");
						System.out.println("Le vainqueur est : (joueur1) " + heroName1);
						break;
					}
					System.out.println("------------------------------------------------------------------");
					
					//phase d'attaque du hero2
					System.out.println("(joueur2) "+ heroName2 + " attaque (joueur1) "+ heroName1);
					
					//downcasting de hero1
					int shoot2 = ((ICombat)hero1).applyDamage(dmg2);
					System.out.println("Il reste " + hero1.getHp() + " PV à (joueur1) " + heroName1);
					
					//condition si les PV du hero1 arrivent à 0
					if(hero1.getHp() <= 0 ) {
						System.out.println("------------------------------------------------------------------");
						System.out.println(" (joueur1) " + heroName1 + " est mort.");
						System.out.println("Le vainqueur est : (joueur2) " + heroName2);
						break;
					}
					System.out.println("------------------------------------------------------------------");
					
				//définition des conditions de sortie de la boucle
				} while (hero1.getHp() >= 0 || hero2.getHp() >= 0 );			
			}
		}
	}
	
	//gestion des erreurs de saisie dans la console et définition des types de heros
	public static Hero getPlayerClass(String n) {
		Hero myHero = null;
		if (n.equals("Romuald")) {
			myHero = new Romuald();
		} else if (n.equals("Mage")) {
			myHero = new Mage();
		} else if (n.equals("Assassin")) {
			myHero = new Assassin();
		} else {
			System.out.println("Veuillez rentrer une valeur correcte svp.");
		}
		return myHero;
	}
}
