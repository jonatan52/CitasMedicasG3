
package com.backend.citas.Dao;
import com.backend.citas.Models.Pacientes;
import org.springframework.data.repository.CrudRepository;



public interface PacientesDao extends CrudRepository<Pacientes, Integer> {
    
}

