import java.rmi.Naming;
public class ServerFile
{ 
	public static void main(String args[]) 
	{ 
		try 
		{ 
			Naming.rebind("Implement",new Implement()); 
			System.out.println("Server is running and waiting for client input"); 
		} 
		catch(Exception e)
		{ 
			System.out.println("Server connection failed: "+e); 
		} 
	} 
}
