
package com.backend.citas.Dao;

import com.backend.citas.Models.Medicamentos;
import org.springframework.data.repository.CrudRepository;



public interface MedicamentosDao extends CrudRepository<Medicamentos, Integer> {
    
}

