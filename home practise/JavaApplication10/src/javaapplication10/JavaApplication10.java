/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author HP
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=1;
        int b=2;
        int c=3;
        a|=4;
        b>>=1;
        c<<=1;
        a^=c;
        System.out.println(a+" "+b+" "+c);
        
    }
    
}
