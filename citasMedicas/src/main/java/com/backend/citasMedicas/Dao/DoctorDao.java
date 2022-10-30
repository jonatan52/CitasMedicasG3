package com.backend.citasMedicas.Dao;
import com.backend.citasMedicas.Models.Doctor;
import org.springframework.data.repository.CrudRepository;
public interface DoctorDao extends CrudRepository<Doctor, Integer> {
    
}
