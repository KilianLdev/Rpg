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
public class Combat {
    
    
    public static void pv (Hero joueur1, Hero joueur2) {
        ICombat hero1 = null;
        ICombat hero2 = null;
        
        if(joueur1 instanceof ICombat){
           
            hero1 = (ICombat) joueur1;
            }
        
        if(joueur2 instanceof ICombat) {
            
            hero2 = (ICombat) joueur2;
        }
        
        if (hero1 != null && hero2 !=null) {
            int dmg1 = hero1.getDmg(); 
            int dmg2 = hero2.getDmg();
            hero1.subisdmg(dmg2);
            hero2.subisdmg(dmg1);
          
        }
    }
}


