/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingen;

import java.util.Random;

public class Generate {

    public static String thePin() {
      
        Random pinner = new Random();
        
        int first = pinner.nextInt(9);
        int second= pinner.nextInt(9);
        int third = pinner.nextInt(9);
        int fourth= pinner.nextInt(9);
        int fifth= pinner.nextInt(9);
        int sixth = pinner.nextInt(9);
        int seventh = pinner.nextInt(9);
        
        String code = "";
        code = (" " + first + second + " " + third + fourth +" "+ fifth + sixth
                + seventh);  
        
        return code;
    }
}
