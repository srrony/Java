/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.pattern.pkg7;

/**
 *
 * @author HP
 */
public class NumberPattern7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int row,column,test_case;
        test_case=5;
        for(row=1;row<=test_case;row++)
        {
            for(column=1;column<=test_case;column++)
            {
                if((row%2==0&&column%2==0)||(row%2!=0&&column%2!=0))
                {
                    System.out.print("1");
                }
                else{System.out.print("0");}
            }
            System.out.println();
        }
    }
    
}
