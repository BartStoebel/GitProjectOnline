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
        System.out.println("Git in WorkingOnIt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een zin in:");
//        String zin = new StringBuilder();
//        zin.append(scanner.nextLine());
        
        String zin = scanner.nextLine();
        System.out.println(zin);
        int a = 0;
        int totaal = 0;
        for ( a =0; a<zin.length(); a++){
            if (zin.charAt(a)=='a'){
                totaal +=1; 
            }
        }
        System.out.println(totaal);
        
    }
    
}

