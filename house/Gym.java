package house;

import java.util.Scanner;

public class Gym extends Rooms {

	public Gym() {
		
	}
	public  Gym selectChoice() {
		System.out.println("=====Your Most Welcome in the Gym =========");
		System.out.println(":");
		System.out.println("=====Here is ==Doumbles for Workout====Benchs for Workout===");
		System.out.println(":");
		System.out.println("Select Your Choice === 1 for Sleep==== 2 For study ==== ");
		Scanner sc=new Scanner(System.in);
		
		 int choice =sc.nextInt();
		 if(choice==1) {
			 System.out.println("==:: Enjoy  your Doumbles Work outs::==");
			 return new Doumbles();
		 }
		 else if(choice==2) {
			 System.out.println("::Enjoy your Benchs Workouts::");
			 return new Benchs();
		 }
		 else {
			 System.err.println("Invalid Choice");
			 return selectChoice();
		 }
		
	}
	
	

}
