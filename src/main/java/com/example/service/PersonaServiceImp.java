package com.example.service;

import com.example.commons.GenericServicePersonaImp;
import com.example.demoModel.Persona;
import com.example.demoRepositoryOrDao.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service // indica que la clase realiza algún servicio, como ejecutar lógica de negocios, realizar cálculos y llamar a API externas
public class PersonaServiceImp extends GenericServicePersonaImp<Persona, Long> implements PersonaService {

    @Autowired // indica la inyección del objeto
    private PersonaDao personaDao;

    @Override // Permite sobrescribir un método al momento que se hereda de una Interface en Java.
    public CrudRepository<Persona, Long> getPersonaDao() {
        return null;
    }
}
