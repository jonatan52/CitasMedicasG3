package com.backend.citasMedicas.Dao;
import com.backend.citasMedicas.Models.Pacientes;
import org.springframework.data.repository.CrudRepository;
public interface PacientesDao extends CrudRepository<Pacientes, Integer> {
    
}