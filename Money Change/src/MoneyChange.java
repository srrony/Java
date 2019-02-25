/*===========================================================================================
 * Program #	: LAB_W_3_L_5_P_4
 * Name			: Money Change
 * Version		: 1.0
 * Copyright	: Z Technology
 * Description	: This code will be helped to find how many notes will get by changing money.
 ============================================================================================
 */

/**
 * @author MS Zaman
 *
 */
public class MoneyChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 4988,five_hundred_note,one_hundred,one_hundred_note,fifty,fifty_note;
		int twenty,twenty_note,ten,ten_note,five,five_note,two,two_note,one_note;
		
		if(input > 500) {
			five_hundred_note = input / 500;
			one_hundred = input - (five_hundred_note * 500);
			
			if(input % 500 == 0) {
				one_hundred_note = 0;
				fifty_note = 0;
				twenty_note = 0;
				ten_note = 0;
				five_note = 0;
				two_note = 0;
				one_note = 0;
				System.out.println("500 taka note = " + five_hundred_note);
				System.out.println("100 taka note = " + one_hundred_note);
				System.out.println("50 taka note = " + fifty_note);
				System.out.println("20 taka note = " + twenty_note);
				System.out.println("10 taka note = " + ten_note);
				System.out.println("5 taka note = " + five_note);
				System.out.println("2 taka note = " + two_note);
				System.out.println("1 taka note = " + one_note);
			}
			else {
				one_hundred_note = one_hundred / 100;
				fifty = one_hundred - (one_hundred_note * 100);
				
				if(one_hundred % 100 == 0) {
					System.out.println("500 taka note = " + five_hundred_note);
					System.out.println("100 taka note = " + one_hundred_note);
				}
				else {
					fifty_note = fifty / 50;
					twenty = fifty - (fifty_note * 50);
					if(fifty % 50 == 0) {	
						System.out.println("500 taka note = " + five_hundred_note);
						System.out.println("100 taka note = " + one_hundred_note);
						System.out.println("50 taka note = " + fifty_note);	
					}
					else {		
						twenty_note = twenty / 20;
						ten = twenty - (twenty_note * 20);
						if(twenty % 20 == 0) {
							System.out.println("500 taka note = " + five_hundred_note);
							System.out.println("100 taka note = " + one_hundred_note);
							System.out.println("50 taka note = " + fifty_note);
							System.out.println("20 taka note = " + twenty_note);	
						}
						else {	
							ten_note = ten / 10;
							five = ten - (ten_note * 10);
							if(ten % 10 == 0) {
								System.out.println("500 taka note = " + five_hundred_note);
								System.out.println("100 taka note = " + one_hundred_note);
								System.out.println("50 taka note = " + fifty_note);
								System.out.println("20 taka note = " + twenty_note);
								System.out.println("10 taka note = " + ten_note);
							}
							else {
								five_note = five / 5;
								two = five - (five_note * 5);
								if(five % 5 == 0) {
									System.out.println("500 taka note = " + five_hundred_note);
									System.out.println("100 taka note = " + one_hundred_note);
									System.out.println("50 taka note = " + fifty_note);
									System.out.println("20 taka note = " + twenty_note);
									System.out.println("10 taka note = " + ten_note);
									System.out.println("5 taka note = " + five_note);
								}
								else {
									two_note = two / 2;
									one_note = two - (two_note * 2);
									if(two % 2 == 0) {
										System.out.println("500 taka note = " + five_hundred_note);
										System.out.println("100 taka note = " + one_hundred_note);
										System.out.println("50 taka note = " + fifty_note);
										System.out.println("20 taka note = " + twenty_note);
										System.out.println("10 taka note = " + ten_note);
										System.out.println("5 taka note = " + five_note);
										System.out.println("2 taka note = " + two_note);
									}
									else {
										System.out.println("500 taka note = " + five_hundred_note);
										System.out.println("100 taka note = " + one_hundred_note);
										System.out.println("50 taka note = " + fifty_note);
										System.out.println("20 taka note = " + twenty_note);
										System.out.println("10 taka note = " + ten_note);
										System.out.println("5 taka note = " + five_note);
										System.out.println("2 taka note = " + two_note);
										System.out.println("1 taka note = " + one_note);
									}
								}
							}	
						}
					}
				}				
			}
		}
		else if(input <= 500 && input > 100) {
			five_hundred_note = 0;
			one_hundred_note = input / 100;
			fifty = input - (one_hundred_note * 100);
			if(input % 100 == 0) {
				fifty_note = 0;
				twenty_note = 0;
				ten_note = 0;
				five_note = 0;
				two_note = 0;
				one_note = 0;
				System.out.println("500 taka note = " + five_hundred_note);
				System.out.println("100 taka note = " + one_hundred_note);
				System.out.println("50 taka note = " + fifty_note);
				System.out.println("20 taka note = " + twenty_note);
				System.out.println("10 taka note = " + ten_note);
				System.out.println("5 taka note = " + five_note);
				System.out.println("2 taka note = " + two_note);
				System.out.println("1 taka note = " + one_note);
			}
			else {
				fifty_note = fifty / 50;
				twenty = fifty - (fifty_note * 50);
				if(fifty % 50 == 0) {	
					System.out.println("500 taka note = " + five_hundred_note);
					System.out.println("100 taka note = " + one_hundred_note);
					System.out.println("50 taka note = " + fifty_note);	
				}
				else {		
					twenty_note = twenty / 20;
					ten = twenty - (twenty_note * 20);
					if(twenty % 20 == 0) {
						System.out.println("500 taka note = " + five_hundred_note);
						System.out.println("100 taka note = " + one_hundred_note);
						System.out.println("50 taka note = " + fifty_note);
						System.out.println("20 taka note = " + twenty_note);	
					}
					else {	
						ten_note = ten / 10;
						five = ten - (ten_note * 10);
						if(ten % 10 == 0) {
							System.out.println("500 taka note = " + five_hundred_note);
							System.out.println("100 taka note = " + one_hundred_note);
							System.out.println("50 taka note = " + fifty_note);
							System.out.println("20 taka note = " + twenty_note);
							System.out.println("10 taka note = " + ten_note);
						}
						else {
							five_note = five / 5;
							two = five - (five_note * 5);
							if(five % 5 == 0) {
								System.out.println("500 taka note = " + five_hundred_note);
								System.out.println("100 taka note = " + one_hundred_note);
								System.out.println("50 taka note = " + fifty_note);
								System.out.println("20 taka note = " + twenty_note);
								System.out.println("10 taka note = " + ten_note);
								System.out.println("5 taka note = " + five_note);
							}
							else {
								two_note = two / 2;
								one_note = two - (two_note * 2);
								if(two % 2 == 0) {
									System.out.println("500 taka note = " + five_hundred_note);
									System.out.println("100 taka note = " + one_hundred_note);
									System.out.println("50 taka note = " + fifty_note);
									System.out.println("20 taka note = " + twenty_note);
									System.out.println("10 taka note = " + ten_note);
									System.out.println("5 taka note = " + five_note);
									System.out.println("2 taka note = " + two_note);
								}
								else {
									System.out.println("500 taka note = " + five_hundred_note);
									System.out.println("100 taka note = " + one_hundred_note);
									System.out.println("50 taka note = " + fifty_note);
									System.out.println("20 taka note = " + twenty_note);
									System.out.println("10 taka note = " + ten_note);
									System.out.println("5 taka note = " + five_note);
									System.out.println("2 taka note = " + two_note);
									System.out.println("1 taka note = " + one_note);
								}
							}
						}	
					}
				}
			}
		}
		else if(input <= 100 && input > 50) {
			five_hundred_note = 0;
			one_hundred_note = 0;
			fifty_note = input / 50;
			twenty = input - (fifty_note * 50);
			if(input % 50 == 0) {	
				twenty_note = 0;
				ten_note = 0;
				five_note = 0;
				two_note = 0;
				one_note = 0;
				System.out.println("500 taka note = " + five_hundred_note);
				System.out.println("100 taka note = " + one_hundred_note);
				System.out.println("50 taka note = " + fifty_note);
				System.out.println("20 taka note = " + twenty_note);
				System.out.println("10 taka note = " + ten_note);
				System.out.println("5 taka note = " + five_note);
				System.out.println("2 taka note = " + two_note);
				System.out.println("1 taka note = " + one_note);	
			}
			else {		
				twenty_note = twenty / 20;
				ten = twenty - (twenty_note * 20);
				if(twenty % 20 == 0) {
					System.out.println("500 taka note = " + five_hundred_note);
					System.out.println("100 taka note = " + one_hundred_note);
					System.out.println("50 taka note = " + fifty_note);
					System.out.println("20 taka note = " + twenty_note);	
				}
				else {	
					ten_note = ten / 10;
					five = ten - (ten_note * 10);
					if(ten % 10 == 0) {
						System.out.println("500 taka note = " + five_hundred_note);
						System.out.println("100 taka note = " + one_hundred_note);
						System.out.println("50 taka note = " + fifty_note);
						System.out.println("20 taka note = " + twenty_note);
						System.out.println("10 taka note = " + ten_note);
					}
					else {
						five_note = five / 5;
						two = five - (five_note * 5);
						if(five % 5 == 0) {
							System.out.println("500 taka note = " + five_hundred_note);
							System.out.println("100 taka note = " + one_hundred_note);
							System.out.println("50 taka note = " + fifty_note);
							System.out.println("20 taka note = " + twenty_note);
							System.out.println("10 taka note = " + ten_note);
							System.out.println("5 taka note = " + five_note);
						}
						else {
							two_note = two / 2;
							one_note = two - (two_note * 2);
							if(two % 2 == 0) {
								System.out.println("500 taka note = " + five_hundred_note);
								System.out.println("100 taka note = " + one_hundred_note);
								System.out.println("50 taka note = " + fifty_note);
								System.out.println("20 taka note = " + twenty_note);
								System.out.println("10 taka note = " + ten_note);
								System.out.println("5 taka note = " + five_note);
								System.out.println("2 taka note = " + two_note);
							}
							else {
								System.out.println("500 taka note = " + five_hundred_note);
								System.out.println("100 taka note = " + one_hundred_note);
								System.out.println("50 taka note = " + fifty_note);
								System.out.println("20 taka note = " + twenty_note);
								System.out.println("10 taka note = " + ten_note);
								System.out.println("5 taka note = " + five_note);
								System.out.println("2 taka note = " + two_note);
								System.out.println("1 taka note = " + one_note);
							}
						}
					}	
				}
			}
		}
		else if(input <= 50 && input > 20) {
			five_hundred_note = 0;
			one_hundred_note = 0;
			fifty_note = 0;
			twenty_note = input / 20;
			ten = input - (twenty_note * 20);
			if(input % 20 == 0) {
				ten_note = 0;
				five_note = 0;
				two_note = 0;
				one_note = 0;
				System.out.println("500 taka note = " + five_hundred_note);
				System.out.println("100 taka note = " + one_hundred_note);
				System.out.println("50 taka note = " + fifty_note);
				System.out.println("20 taka note = " + twenty_note);
				System.out.println("10 taka note = " + ten_note);
				System.out.println("5 taka note = " + five_note);
				System.out.println("2 taka note = " + two_note);
				System.out.println("1 taka note = " + one_note);	
			}
			else {	
				ten_note = ten / 10;
				five = ten - (ten_note * 10);
				if(ten % 10 == 0) {
					System.out.println("500 taka note = " + five_hundred_note);
					System.out.println("100 taka note = " + one_hundred_note);
					System.out.println("50 taka note = " + fifty_note);
					System.out.println("20 taka note = " + twenty_note);
					System.out.println("10 taka note = " + ten_note);
				}
				else {
					five_note = five / 5;
					two = five - (five_note * 5);
					if(five % 5 == 0) {
						System.out.println("500 taka note = " + five_hundred_note);
						System.out.println("100 taka note = " + one_hundred_note);
						System.out.println("50 taka note = " + fifty_note);
						System.out.println("20 taka note = " + twenty_note);
						System.out.println("10 taka note = " + ten_note);
						System.out.println("5 taka note = " + five_note);
					}
					else {
						two_note = two / 2;
						one_note = two - (two_note * 2);
						if(two % 2 == 0) {
							System.out.println("500 taka note = " + five_hundred_note);
							System.out.println("100 taka note = " + one_hundred_note);
							System.out.println("50 taka note = " + fifty_note);
							System.out.println("20 taka note = " + twenty_note);
							System.out.println("10 taka note = " + ten_note);
							System.out.println("5 taka note = " + five_note);
							System.out.println("2 taka note = " + two_note);
						}
						else {
							System.out.println("500 taka note = " + five_hundred_note);
							System.out.println("100 taka note = " + one_hundred_note);
							System.out.println("50 taka note = " + fifty_note);
							System.out.println("20 taka note = " + twenty_note);
							System.out.println("10 taka note = " + ten_note);
							System.out.println("5 taka note = " + five_note);
							System.out.println("2 taka note = " + two_note);
							System.out.println("1 taka note = " + one_note);
						}
					}
				}	
			}
		}
		else if(input <= 20 && input > 10) {
			five_hundred_note = 0;
			one_hundred_note = 0;
			fifty_note = 0;
			twenty_note = 0;
			ten_note = input / 10;
			five = input - (ten_note * 10);
			if(input % 10 == 0) {
				five_note = 0;
				two_note = 0;
				one_note = 0;
				System.out.println("500 taka note = " + five_hundred_note);
				System.out.println("100 taka note = " + one_hundred_note);
				System.out.println("50 taka note = " + fifty_note);
				System.out.println("20 taka note = " + twenty_note);
				System.out.println("10 taka note = " + ten_note);
				System.out.println("5 taka note = " + five_note);
				System.out.println("2 taka note = " + two_note);
				System.out.println("1 taka note = " + one_note);
			}
			else {
				five_note = five / 5;
				two = five - (five_note * 5);
				if(five % 5 == 0) {
					System.out.println("500 taka note = " + five_hundred_note);
					System.out.println("100 taka note = " + one_hundred_note);
					System.out.println("50 taka note = " + fifty_note);
					System.out.println("20 taka note = " + twenty_note);
					System.out.println("10 taka note = " + ten_note);
					System.out.println("5 taka note = " + five_note);
				}
				else {
					two_note = two / 2;
					one_note = two - (two_note * 2);
					if(two % 2 == 0) {
						System.out.println("500 taka note = " + five_hundred_note);
						System.out.println("100 taka note = " + one_hundred_note);
						System.out.println("50 taka note = " + fifty_note);
						System.out.println("20 taka note = " + twenty_note);
						System.out.println("10 taka note = " + ten_note);
						System.out.println("5 taka note = " + five_note);
						System.out.println("2 taka note = " + two_note);
					}
					else {
						System.out.println("500 taka note = " + five_hundred_note);
						System.out.println("100 taka note = " + one_hundred_note);
						System.out.println("50 taka note = " + fifty_note);
						System.out.println("20 taka note = " + twenty_note);
						System.out.println("10 taka note = " + ten_note);
						System.out.println("5 taka note = " + five_note);
						System.out.println("2 taka note = " + two_note);
						System.out.println("1 taka note = " + one_note);
					}
				}
			}
		}
		else if(input <= 10 && input > 5) {
			five_hundred_note = 0;
			one_hundred_note = 0;
			fifty_note = 0;
			twenty_note = 0;
			ten_note = 0;
			five_note = input / 5;
			two = input - (five_note * 5);
			if(input % 5 == 0) {
				two_note = 0;
				one_note = 0;
				System.out.println("500 taka note = " + five_hundred_note);
				System.out.println("100 taka note = " + one_hundred_note);
				System.out.println("50 taka note = " + fifty_note);
				System.out.println("20 taka note = " + twenty_note);
				System.out.println("10 taka note = " + ten_note);
				System.out.println("5 taka note = " + five_note);
				System.out.println("2 taka note = " + two_note);
				System.out.println("1 taka note = " + one_note);
			}
			else {
				two_note = two / 2;
				one_note = two - (two_note * 2);
				if(two % 2 == 0) {
					System.out.println("500 taka note = " + five_hundred_note);
					System.out.println("100 taka note = " + one_hundred_note);
					System.out.println("50 taka note = " + fifty_note);
					System.out.println("20 taka note = " + twenty_note);
					System.out.println("10 taka note = " + ten_note);
					System.out.println("5 taka note = " + five_note);
					System.out.println("2 taka note = " + two_note);
				}
				else {
					System.out.println("500 taka note = " + five_hundred_note);
					System.out.println("100 taka note = " + one_hundred_note);
					System.out.println("50 taka note = " + fifty_note);
					System.out.println("20 taka note = " + twenty_note);
					System.out.println("10 taka note = " + ten_note);
					System.out.println("5 taka note = " + five_note);
					System.out.println("2 taka note = " + two_note);
					System.out.println("1 taka note = " + one_note);
				}
			}
		}
		else if(input <= 5 && input > 2) {
			five_hundred_note = 0;
			one_hundred_note = 0;
			fifty_note = 0;
			twenty_note = 0;
			ten_note = 0;
			five_note = 0;
			two_note = input / 2;
			one_note = input - (two_note * 2);
			if(input % 2 == 0) {
				one_note = 0;
				System.out.println("500 taka note = " + five_hundred_note);
				System.out.println("100 taka note = " + one_hundred_note);
				System.out.println("50 taka note = " + fifty_note);
				System.out.println("20 taka note = " + twenty_note);
				System.out.println("10 taka note = " + ten_note);
				System.out.println("5 taka note = " + five_note);
				System.out.println("2 taka note = " + two_note);
				System.out.println("1 taka note = " + one_note);
			}
			else {
				System.out.println("500 taka note = " + five_hundred_note);
				System.out.println("100 taka note = " + one_hundred_note);
				System.out.println("50 taka note = " + fifty_note);
				System.out.println("20 taka note = " + twenty_note);
				System.out.println("10 taka note = " + ten_note);
				System.out.println("5 taka note = " + five_note);
				System.out.println("2 taka note = " + two_note);
				System.out.println("1 taka note = " + one_note);
			}
		}
		else {
			five_hundred_note = 0;
			one_hundred_note = 0;
			fifty_note = 0;
			twenty_note = 0;
			ten_note = 0;
			five_note = 0;
			two_note = 0;
			System.out.println("500 taka note = " + five_hundred_note);
			System.out.println("100 taka note = " + one_hundred_note);
			System.out.println("50 taka note = " + fifty_note);
			System.out.println("20 taka note = " + twenty_note);
			System.out.println("10 taka note = " + ten_note);
			System.out.println("5 taka note = " + five_note);
			System.out.println("2 taka note = " + two_note);
			System.out.println("1 taka note = " + input);
		}
		
	}

}
