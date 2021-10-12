/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Controler;


import fr.ufrsciencestech.panier.Model.*;
import fr.ufrsciencestech.panier.Model.Panier;
import fr.ufrsciencestech.panier.Model.PanierPleinException;
import fr.ufrsciencestech.panier.Model.PanierVideException;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

/**
 *
 * @author celine
 */
public class ControleurSimple extends Controleur{
    private Panier panier;
    
    public ControleurSimple(){
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(((Component)e.getSource()).getName().equals("Plus"))
            try {
                p.ajoute();
        } catch (PanierPleinException ex) {
            //JOptionPane.showMessageDialog(null, "Panier plein", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        else
            try {
                p.retire();
        } catch (PanierVideException ex) {
            //JOptionPane.showMessageDialog(null, "Panier vide", "Erreur", JOptionPane.ERROR_MESSAGE) ;
        }
            
    }
    
    public void Plus(Object o,JTextField jTextField1 , Panier p){
        this.panier=p;
        try{
            
            this.panier.ajoute((Fruit)o);
        }catch(PanierPleinException e){
            //e.printStackTrace();
            System.out.println(e.toString());
        };
        jTextField1.setText("le panier contient "+this.panier.getTaille()+" fruits");
        System.out.println("le panier contient "+this.panier.getTaille()+" fruits");
        System.out.println(o.toString());
        
    }
    
}
