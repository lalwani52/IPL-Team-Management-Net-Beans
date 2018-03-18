/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team72sessionp;

import javax.ejb.Stateless;

/**
 *
 * @author Lalwani
 */
@Stateless
public class team72session implements team72sessionLocal {
private static final String avail[]= new String[] {"Available","Available","Available","Available","Available","Available"};
	private static final int price[]={50000000,7000000,11000000,25000000,15000000,25000000};
	
    @Override
    public String sign(int choice) {
        int flag,m;
		flag=choice;
		for(m=0;m<price.length;m++)
		{
			if(m==flag && avail[m].equals("Available")){
				avail[m] = "Unavailable";
				return "Player " +m+ " Signed";
			
			}
		}
		if(m==price.length)
			return "No such player";
		return "";
    }
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public String revoke(int cho) {
        int flag1,m;
		flag1=cho;
		for(m=0;m<price.length;m++)
		{
			if(m==flag1 && avail[m].equals("Unavailable")){
				avail[m] = "Available";	
				return "Contract Revoked";				
				
			}
		}
		if(m==price.length)
			return "You have not signed that player";
		return "";
    }

    @Override
    public String[] playerDetails() {
        	String shop[]= new String[] {"a","b","c","d","e","f"};
		return shop;
    }

    @Override
    public int[] getAmt() {
        return price;
    }

    @Override
    public String[] avail() {
        return avail;
    }
    
    

}
