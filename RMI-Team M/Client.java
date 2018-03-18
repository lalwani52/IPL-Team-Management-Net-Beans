import java.rmi.Naming;
import java.util.*;
public class Client
{
	public static void main(String args[])
	{
		try
		{
			Interf inf=(Interf)Naming.lookup("//localhost/Implement");
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
			int prices[]=new int[10];
			String msg1,msg2;
			players=inf.playerDetails();
			prices=inf.getAmt();
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
					case 1: x=inf.avail();
							for(l=0;l<players.length;l++){
								System.out.println("Player ID:"+l+" Player Name:"+players[l]+"      "+"Availability:"+x[l]+"    Signing Cost:"+prices[l]);
							}
							break;
					case 2: System.out.println("Enter Player Id of the player you want to Sign");
							c=s.nextInt();
							msg1=inf.sign(c);
							System.out.println(msg1);
							break;
					case 3: System.out.println("Enter Player Id of the player you want to remove from the team");
							c=s.nextInt();						
							msg2=inf.revoke(c);
							System.out.println(msg2);
							break;
					case 4: x=inf.avail();
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
		}
		catch(Exception e)
		{
			System.out.println("Client Exception: "+e);
		}
	}
}