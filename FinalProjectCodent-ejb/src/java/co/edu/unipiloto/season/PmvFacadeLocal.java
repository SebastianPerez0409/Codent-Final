/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.season;

import co.edu.unipiloto.entitys.Pmv;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ingse
 */
@Local
public interface PmvFacadeLocal {

    void create(Pmv pmv);

    void edit(Pmv pmv);

    void remove(Pmv pmv);

    Pmv find(Object id);

    List<Pmv> findAll();

    List<Pmv> findRange(int[] range);

    int count();

 
    
}
