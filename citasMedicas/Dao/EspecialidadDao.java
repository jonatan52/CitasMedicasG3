package com.backend.citasMedicas.Dao;
import com.backend.citasMedicas.Models.Especialidad;
import org.springframework.data.repository.CrudRepository;
public interface EspecialidadDao extends CrudRepository<Especialidad, Integer> {
    
}