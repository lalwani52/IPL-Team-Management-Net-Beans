/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team72sessionp;

import javax.ejb.Local;

/**
 *
 * @author Lalwani
 */
@Local
public interface team72sessionLocal {

    String sign(int choice);

    String revoke(int cho);

    String[] playerDetails();

    int[] getAmt();

    String[] avail();

 
    
}
