/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSTMp;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Lalwani
 */
@WebService(serviceName = "WSTM")
@Stateless()
public class WSTM {
private static final String avail[]= new String[] {"Available","Available","Available","Available","Available","Available"};
	private static final int price[]={50000000,7000000,11000000,25000000,15000000,25000000};
    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param choice
     * @return 
     */
    @WebMethod(operationName = "sign")
    public String sign(@WebParam(name = "choice") int choice) {
        //TODO write your implementation code here:
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

    /**
     * Web service operation
     * @param cho
     * @return 
     */
    @WebMethod(operationName = "revoke")
    public String revoke(@WebParam(name = "cho") int cho) {
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

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "playerDetails")
    public String[] playerDetails() {
        String shop[]= new String[] {"a","b","c","d","e","f"};
		return shop;
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "getAmt")
    public int[] getAmt() {
        //TODO write your implementation code here:
        return price;
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "avail")
    public String[] avail() {
        //TODO write your implementation code here:
        return avail;
    }
    
    
    
    
    
    
}
