package house;

import java.util.Scanner;

public class Person_User {
	  
	

	public static void main(String[] args) {
		
		House h1= new House();
		Person_User p1=new Person_User();
		
		try {
			if(h1.getKey()==355202 ) {
				
				
				char c;
				do {
//				h1.t1.selectTap();
				 
				    h1.rm1.selectRooms();
				  
				  
					
				Scanner sc=new Scanner(System.in);
				System.out.println(":: Press Y/y for Return Back :::: &::: something else for quite :::");
				c=sc.next().charAt(0);
				}while(c=='Y'|| c=='y');
				{
				 System.out.println("Thank you");
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
