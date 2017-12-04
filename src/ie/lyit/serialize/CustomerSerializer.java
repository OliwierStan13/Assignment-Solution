package ie.lyit.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


import ie.lyit.Hotel.*;

public class CustomerSerializer 
{
	private	ArrayList<Customer> customers;
	
	private final String FILENAME = "customers.ser";
	
	
	public CustomerSerializer()
	{
		customers = new ArrayList<Customer>();
	}
	
	public void add()
	{
		Customer cust = new Customer();
		//cust.();
		customers.add(cust);
	}
	
	public String view()
	{
		Customer cust = new Customer();
		return cust.toString();
	}
	
	public void list()
	{
		for(Customer tmpCustomer:customers)
			System.out.println(tmpCustomer);
	}
	
	public void edit() //String t,String fN, String sN, String a, String pN ,String emaiAddress)
	{
		
	}
	
	public void delete()
	{
		
	}
	
	
	public void writeRecordsToFile()
	{
		try {
			FileOutputStream filestream = new FileOutputStream(FILENAME);
		
			ObjectOutputStream os = new ObjectOutputStream(filestream);
			os.writeObject(customers);
			os.close();
		
	
		}
		catch(FileNotFoundException fNFE)
		{
			System.out.println("Cannot create file to store customers.");
		}
		catch(IOException ioE)
		{
			System.out.println(ioE.getMessage());
		}
	}
	
	public void readRecordsFromFile()
	{
		try {
			FileInputStream fileStream = new FileInputStream(FILENAME);
			
			ObjectInputStream is = new ObjectInputStream(fileStream);
			
			customers = (ArrayList<Customer>)is.readObject();
			
			is.close();
		}
		catch(FileNotFoundException fNFE)
		{
			System.out.println("Cannot create file to store customers.");
		}
		catch(IOException iOE)
		{
			System.out.println(iOE.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
