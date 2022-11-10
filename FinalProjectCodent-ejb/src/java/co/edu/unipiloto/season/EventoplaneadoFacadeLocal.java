/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.season;

import co.edu.unipiloto.entitys.Eventoplaneado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ingse
 */
@Local
public interface EventoplaneadoFacadeLocal {

    void create(Eventoplaneado eventoplaneado);

    void edit(Eventoplaneado eventoplaneado);

    void remove(Eventoplaneado eventoplaneado);

    Eventoplaneado find(Object id);

    List<Eventoplaneado> findAll();

    List<Eventoplaneado> findRange(int[] range);

    int count();
    
}
