package house;

import java.util.Scanner;

 final public class House {
	
	private int key=355202;
	
	House()
	{	
	}
	Rooms rm1=new Rooms();
	

	public int getKey() {
		System.out.println("======::Enter Your Personal_Key to Open Your House::=========");
		Scanner sc=new Scanner(System.in);
		int personal_key=sc.nextInt();
		if(key==personal_key) {
			System.out.println("========::Access Granted :: You can Enter in Your House ::======");
			
			return key;
		}
		else {
			System.err.println("!! Access Denied !!");
			System.out.println("Incorrect Entered Pin");
			return 0;
		}
	}
	
	
	
	
	      
	
	
	
	
	

	

}
