/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicagit2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ariel
 */
public class Ariel {
    
    public static void modificaciones(){
        JOptionPane.showMessageDialog(null, "Nuevas modificaciones");
        JOptionPane.showMessageDialog(null, "Mas modificaciones");
    }
    
    public static void prevencion(){
        try{
            modificaciones();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
    
    public static void main(String[] args){
        //JOptionPane.showMessageDialog(null, "Todo ok");
        prevencion();
    }
}
