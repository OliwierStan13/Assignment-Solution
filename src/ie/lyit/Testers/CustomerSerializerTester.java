package ie.lyit.Testers;

import ie.lyit.serialize.CustomerSerializer.*;
import ie.lyit.serialize.*;
import java.util.Scanner;

public class CustomerSerializerTester 
{

	CustomerSerializer custSerializer = new CustomerSerializer();
	
	private int option;
	
	//custSerializer.readRecordsFromFile();
	
	public void display()
	{
		System.out.println("\ti. Add");
		System.out.println("\t2. List");
		System.out.println("\t3. View");
		System.out.println("\t4. Edit");
		System.out.println("\t5. Delete");
		System.out.println("\t6. Quit");
	}
	
	public void readOption()
	{
		Scanner kbInt = new Scanner(System.in);
		System.out.println("\n\tEnter Option [1|2|3|4|5|6]");
		option = kbInt.nextInt();
	}
	
	public int getOption() 
	{
		return option;
	}
	
	/*
	 do {
		if(option == 1)
			custSerializer.add();
		else if(option == 2)
			custSerializer.list();
		else if(option == 3)
			custSerializer.view();
		else if(option == 4)
			custSerializer.edit();
		else if(option == 5)
			custSerializer.delete();
		
	}while(option != 6);
	
	*/
	

}
