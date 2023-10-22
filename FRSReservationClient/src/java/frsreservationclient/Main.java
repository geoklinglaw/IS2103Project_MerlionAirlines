/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frsreservationclient;

import ejb.session.stateless.PersonSessionBeanRemote;
import entity.Person;
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        String firstName = "tom";
        String lastName = "dick";
        int role = 1;
        Person person = new Person(firstName, lastName, role);
        System.out.println(person.getFirstName() + " is a " + person.getRole());
    }
    
}
