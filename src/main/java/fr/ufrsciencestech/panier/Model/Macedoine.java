/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Model;
import fr.ufrsciencestech.panier.Model.Fruit;

import java.util.ArrayList;


public class Macedoine implements Fruit{
    private ArrayList<Fruit> fruits ;
    private boolean seedless;
    
        public Macedoine(Fruit f){
            this.fruits = new ArrayList<Fruit>();
            this.seedless = true;
            this.fruits.add(f);
        }
        
        //ajout de fruit
        public void ajoute(Fruit f){
            this.fruits.add(f);
        }
        
        public String toString(){
            String res ="";
            for(int i = 0 ; i<fruits.size();i++){
                    Fruit f = fruits.get(i);
                    res = res + f.toString();
        }
            return res;
        }
        
        
        @Override
        public double getPrix(){
            double totale = 0;
            for(int i = 0 ;i<this.fruits.size();i++){
                Fruit f = (Fruit)fruits.get(i);
                totale = totale + f.getPrix();
                
            }
            return totale;
        }

    @Override
    public boolean isSeedless() {
        boolean res = false;
            for(int i = 0 ; i<fruits.size();i++){
                if(fruits.get(i).isSeedless() == true){
                    res = true;
                }
            }
            return res;
    }
    
    @Override
    public String getOrigine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
        
}
