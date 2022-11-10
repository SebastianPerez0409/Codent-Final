/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.season;

import co.edu.unipiloto.entitys.Vias;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ingse
 */
@Local
public interface ViasFacadeLocal {

    void create(Vias vias);

    void edit(Vias vias);

    void remove(Vias vias);

    Vias find(Object id);

    List<Vias> findAll();

    List<Vias> findRange(int[] range);

    int count();
    
}
