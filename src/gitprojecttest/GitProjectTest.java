/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitprojecttest;

/**
 *
 * @author Bart.Stoebel 
 */
public class GitProjectTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Git in WorkingOnIt");
        System.out.println("hier verder gewerkt:");
        System.out.println("hier opnieuw verder gewerkt:");   
        String tekst = "Dit is een stukje tekst";
        String[] arrString = tekst.split(" ",7);
        for (String a : arrString ){
            System.out.println(a);
        }
       StringBuilder naam = new StringBuilder("Pierre");
       System.out.println(naam.length());
       naam.append(' ');
       naam.insert(0, "De grote ");
       System.out.println(naam);
       
               
       
    }
    
}
