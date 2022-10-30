package com.backend.citasMedicas.Dao;
import com.backend.citasMedicas.Models.CitasMedicas;
import com.backend.citasMedicas.Models.Pacientes;
import com.backend.citasMedicas.Models.Doctor;
import com.backend.citasMedicas.Models.Copago;

import org.springframework.data.repository.CrudRepository;
public interface CitasMedicasDao extends CrudRepository<CitasMedicas, Integer> {
    
}

