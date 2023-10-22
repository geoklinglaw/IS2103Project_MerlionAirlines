/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frsmanagementclient;

import ejb.session.stateless.PersonSessionBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author apple
 */
public class Main {

    @EJB(name = "PersonSessionBeanRemote")
    private static PersonSessionBeanRemote personSessionBeanRemote;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    
}
