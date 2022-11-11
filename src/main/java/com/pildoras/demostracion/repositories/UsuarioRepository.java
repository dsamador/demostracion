package com.pildoras.demostracion.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pildoras.demostracion.models.UsuarioModel;

/* 
 * Todo empieza con el controlador
 * el cual llama al servicio
 * el cual llama al repository
 * el cual a su vez llama al modelo.
 */
@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{
    /* Entre los angulos se pone el tipo de dato y el tipo de dato del 
     * identificador.
     */
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
