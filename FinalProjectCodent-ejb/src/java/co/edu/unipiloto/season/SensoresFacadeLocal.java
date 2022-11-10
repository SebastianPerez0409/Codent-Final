/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.season;

import co.edu.unipiloto.entitys.Sensores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ingse
 */
@Local
public interface SensoresFacadeLocal {

    void create(Sensores sensores);

    void edit(Sensores sensores);

    void remove(Sensores sensores);

    Sensores find(Object id);

    List<Sensores> findAll();

    List<Sensores> findRange(int[] range);

    int count();
    
}
