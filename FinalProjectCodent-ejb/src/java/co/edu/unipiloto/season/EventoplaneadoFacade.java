/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.season;

import co.edu.unipiloto.entitys.Eventoplaneado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ingse
 */
@Stateless
public class EventoplaneadoFacade extends AbstractFacade<Eventoplaneado> implements EventoplaneadoFacadeLocal {

    @PersistenceContext(unitName = "PMVPu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EventoplaneadoFacade() {
        super(Eventoplaneado.class);
    }
    
}
