package house;

import java.util.Scanner;

public class GuestRoom extends Rooms {

	GuestRoom(){
		System.out.println(" :: You have entered in the Guest Room ::");
	}
	
	public  GuestRoom selectChoice() {
		System.out.println("=====Your Most Welcome in the GuestRoom =========");
		System.out.println(":");
		System.out.println("=====Here is ==Bed for Sleep====Table for study===");
		System.out.println(":");
		System.out.println("Select Your Choice === 1 for Sleep==== 2 For study ==== ");
		Scanner sc=new Scanner(System.in);
		
		 int choice =sc.nextInt();
		 if(choice==1) {
			 System.out.println("==::Now you're on the enjoy your sleep::==");
			 return new GuestBed();
		 }
		 else if(choice==2) {
			 return new GuestTable();
		 }
		 else {
			 System.err.println("Invalid Choice");
			 return selectChoice();
		 }
		
	}
}
