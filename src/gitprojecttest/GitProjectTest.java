 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitprojecttest;

import java.util.Scanner;

/**
 *
 * @author Bart.Stoebel 
 */
public class GitProjectTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Git in Master");
//        System.out.println("Git in WorkingOnIt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een palindroom in:");
        String pal = scanner.nextLine();
        Palindroom palindroom  = new Palindroom();
        System.out.println("Het totaal is: " + palindroom.testPalindroom(pal));
        //System.out.println("Proficiat : project geslaagd " + pal);


    }
    
}

