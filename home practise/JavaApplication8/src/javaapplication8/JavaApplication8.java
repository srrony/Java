/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author HP
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5;
        int b=10;
        first:{
            second:{
                third:{
                    if(a==b>>1)
                        break second;
            }
                System.out.println(a);
        }
            System.out.println(b);
    }
    
}
}
