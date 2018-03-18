import HelloApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;
class HelloImpl extends HelloPOA {
private ORB orb;
public void setORB(ORB orb_val) {
orb = orb_val;
}
// implement sayHello() method this definition can be replaced with own method
/*public String sayHello()
{
return "\nHello world !!\n";
}*/

private static String avail[]= new String[] {"Available","Available","Available","Available","Available","Available"};
	private static double price[]={50000000,7000000,11000000,25000000,15000000,25000000};
	
		public HelloImpl()
{}
	
	public String sign(double choice)
	{
		double flag;
		int m;
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

	public String revoke(double cho)
	{
		double flag1;
		int m;
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
	public double[] getAmt()
	{
		return price;
	}
		public String[] avail()
	{
		return avail;
	}

// implement shutdown() method
public void shutdown()
{
orb.shutdown(true);
}
}
public class HelloServer
{public static void main(String args[])
{
try
{
// create and initialize the ORB
ORB orb = ORB.init(args, null);
// get reference to rootpoa & activate the POAManager
POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
rootpoa.the_POAManager().activate();
// create servant and register it with the ORB
HelloImpl helloImpl = new HelloImpl();
helloImpl.setORB(orb);
// get object reference from the servant
org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl);
Hello href = HelloHelper.narrow(ref);
// get the root naming context
org.omg.CORBA.Object objRef =
orb.resolve_initial_references("NameService");
// Use NamingContextExt which is part of the Interoperable
// Naming Service (INS) specification.
NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
// bind the Object Reference in Naming
String name = "Hello";
NameComponent path[] = ncRef.to_name( name );
ncRef.rebind(path, href);
System.out.println("HelloServer ready and waiting ...");
// wait for invocations from clients
orb.run();
}
catch (Exception e) {
System.err.println("ERROR: " + e);e.printStackTrace(System.out);
}
System.out.println("HelloServer Exiting ...");
}
}
