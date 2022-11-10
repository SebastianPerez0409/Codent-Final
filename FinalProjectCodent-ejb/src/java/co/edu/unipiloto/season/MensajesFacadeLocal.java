/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.season;

import co.edu.unipiloto.entitys.Mensajes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ingse
 */
@Local
public interface MensajesFacadeLocal {

    void create(Mensajes mensajes);

    void edit(Mensajes mensajes);

    void remove(Mensajes mensajes);

    Mensajes find(Object id);

    List<Mensajes> findAll();

    List<Mensajes> findRange(int[] range);

    int count();
    
}
