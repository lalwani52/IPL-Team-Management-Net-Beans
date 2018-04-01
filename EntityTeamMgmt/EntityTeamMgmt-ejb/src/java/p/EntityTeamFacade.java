/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lalwani
 */
@Stateless
public class EntityTeamFacade extends AbstractFacade<EntityTeam> implements EntityTeamFacadeLocal {

    @PersistenceContext(unitName = "EntityTeamMgmt-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntityTeamFacade() {
        super(EntityTeam.class);
    }
    
}
