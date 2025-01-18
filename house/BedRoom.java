package house;

import java.util.Scanner;

public class BedRoom  extends Rooms {

	BedRoom(){
		System.out.println(" :: You have entered in the Ded Room ::");
	}
	
	public  BedRoom selectChoice() {
		System.out.println("=====Your Most Welcome in the BedRoom =========");
		System.out.println(":");
		System.out.println("=====Here is ==Bed for Sleep====Table for study===");
		System.out.println(":");
		System.out.println("Select Your Choice === 1 for Sleep==== 2 For study ==== ");
		Scanner sc=new Scanner(System.in);
		
		 int choice =sc.nextInt();
		 if(choice==1) {
			 System.out.println("==::Now you're on the enjoy your sleep::==");
			 return new Bed();
		 }
		 else if(choice==2) {
			 return new Table();
		 }
		 else {
			 System.err.println("Invalid Choice");
			 return selectChoice();
		 }
		
	}
}
