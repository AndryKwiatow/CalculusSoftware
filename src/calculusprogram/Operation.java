/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculusprogram;

import javax.swing.JOptionPane;

/**
 *
 * @author Andry Kwiatow
 */
public class Operation {
    int exponent; 
    public Operation(){
    
    }
    public void setExponent(int exponent){
        this.exponent = exponent;
    }  
        public void getExponent(){
        String result = "x*" + (exponent + 1) +'/' + (exponent + 1);
        JOptionPane.showMessageDialog(null, "The integral is:"  + result);
    }
}
