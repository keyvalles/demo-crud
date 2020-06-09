package com.example.commons;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service // indica que la clase realiza algún servicio, como ejecutar lógica de negocios, realizar cálculos y llamar a API externas
public abstract class GenericServicePersonaImp<T, ID extends Serializable> implements GenericServicePersona<T,ID> {

    @Override // Permite sobrescribir un método al momento que se hereda de una Interface en Java.
    public T save(T entity) {
        return getPersonaDao().save(entity);
    }

    @Override // Permite sobrescribir un método al momento que se hereda de una Interface en Java.
    public void eliminar(ID id) {
        getPersonaDao().deleteById(id);
    }

    @Override
    public T getId(ID id) {
        Optional<T> obj = getPersonaDao().findById(id);
        if (obj.isPresent()){
            return obj.get();
        }
        return null;
    }

    @Override public List<T> getAll() {
        List<T> newList = new ArrayList<>();
        getPersonaDao().findAll().forEach(obj -> newList.add(obj)); //por cada iteración de la lista obtenida del findAll(), se agregará en el lista newList
        return newList;
    }

    /**
     *  Método abstract que permite conocer el repositorio/dao al cual se esta comunicando
     *  para acceder a los métodos que están definidos en la interface DAO/Reposiroty
     */
    public abstract CrudRepository<T,ID> getPersonaDao();
}
