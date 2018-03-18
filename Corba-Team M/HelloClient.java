import HelloApp.*;
import java.io.*;
import java.util.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;import org.omg.CORBA.*;
public class HelloClient
{
static Hello helloImpl;
public static void main(String args[])
{
try
{
// create and initialize the ORB
ORB orb = ORB.init(args, null);
// get the root naming context
org.omg.CORBA.Object objRef =
orb.resolve_initial_references("NameService");
// Use NamingContextExt instead of NamingContext. This is
// part of the Interoperable naming Service.
NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
// resolve the Object Reference in Naming
String nam = "Hello";
helloImpl = HelloHelper.narrow(ncRef.resolve_str(nam));
System.out.println("Obtained a handle on server object: " + helloImpl);
//System.out.println(helloImpl.sayHello());
			String name;
			String city;
			Scanner s= new Scanner(System.in);
			System.out.println("Please Login\n");
			System.out.println("Enter Team name:");
			name=s.nextLine();
			System.out.println("Enter Team city:");
			city=s.nextLine();
			System.out.println("Welcome "+name);			
			String players[]=new String[7];
			double prices[]=new double[10];
			String msg1,msg2;
			players=helloImpl.playerDetails();
			prices=helloImpl.getAmt();
			System.out.println("1.Show Available Players");
			System.out.println("2.Sign Players");
			System.out.println("3.Revoke contract");
			System.out.println("4.Team details");
			System.out.println("5.Log Out");
			int ch,c,l=0;

			String x[]= new String[10];
			do
			{
				System.out.println("Enter your choice");
				ch=s.nextInt();
				switch(ch)
				{
					case 1: x=helloImpl.avail();
							for(l=0;l<players.length;l++){
								System.out.println("Player ID:"+l+" Player Name:"+players[l]+"      "+"Availability:"+x[l]+"    Signing Cost:"+prices[l]);
							}
							break;
					case 2: System.out.println("Enter Player Id of the player you want to Sign");
							c=s.nextInt();
							msg1=helloImpl.sign(c);
							System.out.println(msg1);
							break;
					case 3: System.out.println("Enter Player Id of the player you want to remove from the team");
							c=s.nextInt();						
							msg2=helloImpl.revoke(c);
							System.out.println(msg2);
							break;
					case 4: x=helloImpl.avail();
							System.out.println("Team Name: "+name);
							System.out.println("Team City: "+city);
							for(l=0;l<players.length;l++)
							{
								if(x[l].equals("Unavailable"))
								{
								System.out.println("Player Name: "+players[l]+"  Total Price:"+(prices[l]));
								}
							}
							break;
					case 5: System.out.println("\nThank You For Participating "+name);
							break;
				}
			}while(ch!=5);
			helloImpl.shutdown();
}
catch (Exception e) {
System.out.println("ERROR : " + e) ;
e.printStackTrace(System.out);
}
}
}
