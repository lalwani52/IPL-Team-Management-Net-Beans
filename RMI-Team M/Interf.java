import java.rmi.*;
public interface Interf extends Remote
{
	public String sign(int choice) throws RemoteException;
	public String revoke(int cho) throws RemoteException;
	public String[] playerDetails() throws RemoteException;
	public int[] getAmt() throws RemoteException;
	public String[] avail() throws RemoteException;
}