package house;

import java.util.Scanner;

public class WashRoom  extends Rooms {

	WashRoom()
	{
//		System.out.println(" :: You have entered in the Wash Room ::");
	}
	
	public  WashRoom selectChoice() {
		System.out.println("=====Your Most Welcome in the Wash Room =========");
		System.out.println(":");
		System.out.println("=====Here is ==Null for Water====Besin for Wash hand & face here===");
		System.out.println(":");
		System.out.println("Select Your Choice === 1 for water==== 2 For wash ==== ");
		Scanner sc=new Scanner(System.in);
		
		 int choice =sc.nextInt();
		 if(choice==1) {
			 System.out.println("==::Use Null for Water::==");
			 return new Null();
		 }
		 else if(choice==2) {
			 System.out.println(":: User Besin For Washing ::");
			 return new Besin();
		 }
		 else {
			 System.err.println("Invalid Choice");
			 return selectChoice();
		 }
		
	}
	
}
