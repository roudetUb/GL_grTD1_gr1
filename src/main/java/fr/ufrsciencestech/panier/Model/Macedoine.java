/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Model;
import fr.ufrsciencestech.panier.Model.Fruit;

import java.util.ArrayList;

/**
 *
 * @author me253818
 */
public class Macedoine implements Fruit{
    private ArrayList<Fruit> fruits ;
    private bool seedless;
    
        public Macedoine(Fruit f){
            this.fruits = new ArrayList<Fruit>();
            this.seedless = true;
            this.fruits.add(f);
        }
        
        //ajout de fruit
        public ajoute(Fruit f){
            this.fruits.add(f);
        }
        
        public String toString(){
            String res ="";
            for(int i = 0 ; i<fruits.size();i++){
                    Fruit f = fruits.
                    res = res + f.toString();
        }
            return res;
        }
        
        
        public double getprix(){
            double totale;
            for(int i = 0 ;i<this.fruits.size();i++){
                Fruit f = (Fruit)fruits.get(i);
                totale = totale + f.getPrix();
                
            }
            return totale;
        }
        
        
}
