package house;

import java.util.Scanner;

public class Hall extends Rooms {

	public Hall() {
		
		// TODO Auto-generated constructor stub
		
	}
	
	public  Hall selectChoice() {
		System.out.println("=====Your Most Welcome in the Hall =========");
		System.out.println(":");
		System.out.println("=====Here is ==Sofa for sit  & Sleep====Tv for Watching videos===");
		System.out.println(":");
		System.out.println("Select Your Choice === 1 for Sleep==== 2 For study ==== ");
		Scanner sc=new Scanner(System.in);
		
		 int choice =sc.nextInt();
		 if(choice==1) {
			 System.out.println("==::Enjoy your Sofa Fesilities::==");
			 return new Sofa();
		 }
		 else if(choice==2) {
			 System.out.println("::Enjoys Your Videos::");
			 return new Tv();
		 }
		 else {
			 System.err.println("Invalid Choice");
			 return selectChoice();
		 }
		
	}
 
	
}
