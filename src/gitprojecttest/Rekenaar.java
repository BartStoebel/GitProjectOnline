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
public class Rekenaar {
    public int reken (String s){
        String[] arrString = s.split(" ");
        int b, totaal, teller;
        totaal = Integer.parseInt(arrString[0]);
        String bewerk;
        teller = 1;
        while (teller + 1 < arrString.length){
            bewerk = arrString[teller];
            b = Integer.parseInt(arrString[teller + 1]);
            totaal = bewerking(totaal, b, bewerk);
            teller +=2;
        }
        return totaal;
    }
    private int bewerking (int a, int b, String bewerk){
        if (bewerk.equals("+")){
            return a + b;
        }else if (bewerk.equals("-")){
            return a - b;
        } else {
            return a;
        }
        
        
        
    }
    
}
