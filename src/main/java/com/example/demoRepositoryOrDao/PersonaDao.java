package com.example.demoRepositoryOrDao;

import com.example.demoModel.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {
}
