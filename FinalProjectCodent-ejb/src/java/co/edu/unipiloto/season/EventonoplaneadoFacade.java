/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.season;

import co.edu.unipiloto.entitys.Eventonoplaneado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ingse
 */
@Stateless
public class EventonoplaneadoFacade extends AbstractFacade<Eventonoplaneado> implements EventonoplaneadoFacadeLocal {

    @PersistenceContext(unitName = "PMVPu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EventonoplaneadoFacade() {
        super(Eventonoplaneado.class);
    }
    
        @Override
    public String generarViaAleatoria() {
        String via[] = new String[3];
        int al;
        via[0] = ("BOGOTA-VILLAVICENCIO");
        via[1] = ("BOGOTA-CALI");
        via[2] = ("BUCARAMANGA-BARRANCABERMEJA");

        al = (int) (Math.random() * 3);

        return via[al];
    }

    @Override
    public String generarDescAleatoria() {
        String desc[] = new String[3];
        int al;
        desc[0] = ("Derrumbe en la vía");
        desc[1] = ("Manifestacion en la vía");
        desc[2] = ("Cierre por mantenimiento");

        al = (int) (Math.random() * 3);

        return desc[al];
    }

    @Override
    public Integer generarSensorAleatorio() {
        int sens[] = new int[3];
        int al;
        sens[0] = 1;
        sens[1] = 20;
        sens[2] = 60;

        al = (int) (Math.random() * 3);

        return sens[al];
    }
    
}
