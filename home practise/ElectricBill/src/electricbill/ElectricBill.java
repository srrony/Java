/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricbill;

/**
 *
 * @author HP
 */
public class ElectricBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        		
		double uses_unit = 50, range_1, range_2, range_3, range_4;
		double range_1_limit, range_2_limit, range_3_limit, range_4_limit;
		double range_1_bill, range_2_bill, range_3_bill, range_4_bill, range_5_bill;
		double range_1_total,range_2_total, range_3_total,range_4_total;
		double remaining_unit, vat, total_vat, sub_total, grand_total;
		
		vat = 15.0/100.0;	// assign 15% vat into vat variable
		
		range_1_limit = 200.0;	// maximum unit of range 1
		range_2_limit = 250.0;	// maximum unit of range 2
		range_3_limit = 300.0;	// maximum unit of range 3
		range_4_limit = 400.0;	// maximum unit of range 4
		
		range_1_bill = 5.0;	// per unit bill of range 1
		range_2_bill = 5.5;	// per unit bill of range 2
		range_3_bill = 6.0;	// per unit bill of range 3
		range_4_bill = 7.0;	// per unit bill of range 4
		range_5_bill = 7.5;	// per unit bill of range 5
		
		range_1 = range_1_limit;	// find the length of range 1
		range_2 = range_2_limit - range_1_limit;	// find the length of range 2
		range_3 = range_3_limit - range_2_limit;	// find the length of range 3
		range_4 = range_4_limit - range_3_limit;	// find the length of range 4
		
		range_1_total = range_1 * range_1_bill;		// total bill of range 1
		range_2_total = range_2 * range_2_bill;		// total bill of range 2
		range_3_total = range_3 * range_3_bill;		// total bill of range 3
		range_4_total = range_4 * range_4_bill;		// total bill of range 4
		
		//find the electric bill of range 1
		if(uses_unit <= 200.0) {
			sub_total = uses_unit * range_1_bill;
			total_vat = sub_total * vat;
			grand_total = sub_total + total_vat;
			System.out.println("Total Electric Bill = " + grand_total);
		}
		
		// find the electric bill of range 2
		else if(uses_unit > 200.0 && uses_unit <=250.0) {
			remaining_unit = uses_unit - range_1_limit;
			sub_total = range_1_total + (remaining_unit * range_2_bill);
			total_vat = sub_total * vat;
			grand_total = sub_total + total_vat;
			System.out.println("Total Electric Bill = " + grand_total); 
		}
		
		// find the electric bill of range 3
		else if(uses_unit > 250.0 && uses_unit <= 300.0) {
			remaining_unit = uses_unit - range_2_limit;
			sub_total = range_1_total + range_2_total + (remaining_unit * range_3_bill);
			total_vat = sub_total * vat;
			grand_total = sub_total + total_vat;
			System.out.println("Total Electric Bill = " + grand_total);
		}
		
		// find the electric bill of range 4
		else if(uses_unit > 300.0 && uses_unit <= 400.0) {
			remaining_unit = uses_unit - range_3_limit;
			sub_total = range_1_total + range_2_total + range_3_total + (remaining_unit * range_4_bill);
			total_vat = sub_total * vat;
			grand_total = sub_total + total_vat;
			System.out.println("Total Electric Bill = " + grand_total);
		}
		
		// find the electric bill of range range 5
		else if(uses_unit > 400.0 && uses_unit <= 450.0) {
			remaining_unit = uses_unit - range_4_limit;
			sub_total = range_1_total + range_2_total + range_3_total + range_4_total + (remaining_unit * range_5_bill);
			total_vat = sub_total * vat;
			grand_total = sub_total + total_vat;
			System.out.println("Total Electric Bill = " + grand_total);
		}
		
		// this is for wrong input
		else {
			System.out.println("Input ERROR!!!");
		}
		
	}

}

    
    

