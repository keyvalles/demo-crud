package com.example.commons;

import java.io.Serializable;
import java.util.List;

public interface GenericServicePersona<T, ID extends Serializable> {

    /**
     *  Método generico para guardar la entidad
     */
    T save(T entity);

    /**
     *  Método generico para eliminar la entidad
     */
    void eliminar (ID id);

    /**
     *  Método generico para obtener un registro por id
     */
    T getId(ID id);

    /**
     *  Método generico para obtener todos los registros de la entidad
     */
    List<T> getAll ();

}
