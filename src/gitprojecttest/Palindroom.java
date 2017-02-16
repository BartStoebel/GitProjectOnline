/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitprojecttest;

/**
 *
 * @author Vinnie
 */
public class Palindroom {
    public boolean testPalindroom(String s){
        boolean check = true;
        s = s.toLowerCase();
        int teller = 0;
        while (teller <= s.length()-teller-1){
            if (s.charAt(teller) != s.charAt(s.length()-teller - 1)){
                check = false;
            }
            teller++;
        }     
        //
        return check;
        
    }
}
