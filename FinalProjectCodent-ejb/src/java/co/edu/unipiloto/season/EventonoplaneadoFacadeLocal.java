/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.season;

import co.edu.unipiloto.entitys.Eventonoplaneado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ingse
 */
@Local
public interface EventonoplaneadoFacadeLocal {

    void create(Eventonoplaneado eventonoplaneado);

    void edit(Eventonoplaneado eventonoplaneado);

    void remove(Eventonoplaneado eventonoplaneado);

    Eventonoplaneado find(Object id);

    List<Eventonoplaneado> findAll();

    List<Eventonoplaneado> findRange(int[] range);

    int count();

    String generarViaAleatoria();

    String generarDescAleatoria();

    Integer generarSensorAleatorio();

}
