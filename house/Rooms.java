package house;

import java.util.Scanner;

public class Rooms {
	
//	Parking p1= new Parking();
//	GuestRoom gs1=new GuestRoom();
//	Hall h1=new Hall();
//	Kitchen k1=new Kitchen();
//	StoreRoom st1=new StoreRoom();
//	WashRoom wr1=new WashRoom();
//	Gym gm1=new Gym();
//	BedRoom bd1=new BedRoom();
	
	
	
	
	
	public  Rooms   selectRooms() {
		System.out.println("===========:Press 1 For Go to Parking Area :===============");
		System.out.println("===========:Press 2 For Go to Hall         :===============");
		System.out.println("===========:Press 3 For Go to Bed-Room     :===============");
		System.out.println("===========:Press 4 For Go to Kitchen      :===============");
		System.out.println("===========:Press 5 For Go to Gym          :===============");
		System.out.println("===========:Press 6 For Go to Wash-Room    :===============");
		System.out.println("===========:Press 7 For Go to Store-Room   :===============");
		System.out.println("===========:Press 8 For Go to Guest Room   :===============");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1) {
			Parking pr1=new Parking();
			
			return pr1;
		}
		else if(choice==2) {
			Hall hl1= new Hall();
			hl1.selectChoice();
			return hl1;
		}
		else if(choice==3) {
			BedRoom bd1=new BedRoom();
			bd1.selectChoice();
			return bd1 ;
		}
		else if(choice==4) {
			
			Kitchen kt1= new Kitchen();
			kt1.selectChoice();
			return kt1;
		}
		else if(choice==5) {
			Gym gm1= new Gym();
			gm1.selectChoice();
			return gm1;
		}
		else if(choice==6) {
			WashRoom ws1= new WashRoom();
			ws1.selectChoice();
			return ws1;
		}
		else if(choice==7) {
			StoreRoom st1= new StoreRoom();
			return st1;
			}
		else if(choice==8) {
			GuestRoom gs1= new GuestRoom();
			gs1.selectChoice();
			return gs1;
		}
		else {
			System.out.println("::: This Room is Not available in Your House :::");
			return selectRooms();
		}
		
		
	}
	
    

}
