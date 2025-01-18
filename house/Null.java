package house;

import java.util.Scanner;

public class Null  extends WashRoom{


	 public  Water  selectTap()
	 {
		 System.out.println("===========Open the tap for take water============");
		 System.out.println("========Close the tap after taking water::=======");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Press 1 for Open the  tap:: ");
		 System.out.println("Press 2 for Close the tap:: ");
		 int choice=sc.nextInt();
		 if(choice==1)
		 {
			 System.out.println("Tap is Opened Collect the water and use it::");
			 Water w=new Water();
			 w.useWater();
			 return w;
		 }
		 else if(choice==2)
		 {
			 System.out.println("Tap has been  Closed  ::");
			 Water w1=new Water();
			 
			 return w1;
		 }		 
		 else {
			 System.out.println("::Invalid Choice::");
			 return selectTap();
		 }
	 }
	 
	 
	
	

}
