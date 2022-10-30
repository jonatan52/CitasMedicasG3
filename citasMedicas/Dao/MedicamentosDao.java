package com.backend.citasMedicas.Dao;
import com.backend.citasMedicas.Models.Medicamentos;
import org.springframework.data.repository.CrudRepository;
public interface MedicamentosDao extends CrudRepository<Medicamentos, Integer> {
    
}