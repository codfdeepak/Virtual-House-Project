package house;

import java.util.Scanner;

public class Kitchen extends Rooms {

	Kitchen(){
		System.out.println(" :: You have entered in the Kitchen ::");
	}
	
	public  Kitchen selectChoice() {
		System.out.println("=====Your Most Welcome in the Kitchen =========");
		System.out.println(":");
		System.out.println("=====Here is ==Frezze for Store Food====Food for Eat===");
		System.out.println(":");
		System.out.println("Select Your Choice === 1 for store==== 2 For Eat ==== ");
		Scanner sc=new Scanner(System.in);
		
		 int choice =sc.nextInt();
		 if(choice==1) {
			 System.out.println("==: you can Store Your Food in Frezze ::==");
			 return new Frezze();
		 }
		 else if(choice==2) {
			 System.out.println(":: Now you can Enjoy your Food ::");
			 return new Foods();
		 }
		 else {
			 System.err.println("Invalid Choice");
			 return selectChoice();
		 }
		
	}
	
}
