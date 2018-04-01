/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lalwani
 */
@Local
public interface EntityTeamFacadeLocal {

    void create(EntityTeam entityTeam);

    void edit(EntityTeam entityTeam);

    void remove(EntityTeam entityTeam);

    EntityTeam find(Object id);

    List<EntityTeam> findAll();

    List<EntityTeam> findRange(int[] range);

    int count();
    
}
