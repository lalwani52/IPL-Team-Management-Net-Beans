import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class Implement extends UnicastRemoteObject implements Interf
{
	private static String avail[]= new String[] {"Available","Available","Available","Available","Available","Available"};
	private static int price[]={50000000,7000000,11000000,25000000,15000000,25000000};
	
	public Implement() throws RemoteException
	{
	}
	
	public String sign(int choice)
	{
		int flag,m;
		flag=choice;
		for(m=0;m<price.length;m++)
		{
			if(m==flag && avail[m].equals("Available")){
				avail[m] = "Unavailable";
				System.out.println("Player Signed");
				break;
			}
		}
		if(m==price.length)
			return "No such player";
		return "";
	}

	public String revoke(int cho)
	{
		int flag1,m;
		flag1=cho;
		for(m=0;m<price.length;m++)
		{
			if(m==flag1 && avail[m].equals("Unavailable")){
				avail[m] = "Available";	
				System.out.println("Contract Revoked");				
				break;
			}
		}
		if(m==price.length)
			return "You have not signed that player";
		return "";
	}
	public String[] playerDetails()
	{
		String shop[]= new String[] {"a","b","c","d","e","f"};
		return shop;
	}
	public int[] getAmt()
	{
		return price;
	}
		public String[] avail()
	{
		return avail;
	}
}