/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise2;

/**
 *
 * @author HP
 */
public class Practise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int x=2;
       int y=0;
       for( ;y<10; ++y)
       {
           if (y%x==0)
               continue;
           else if(y==8)
               break;
           else
               System.out.print (y +" ");
               }
    }
    
}
