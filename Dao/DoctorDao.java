
package com.backend.citas.Dao;

import com.backend.citas.Models.Doctor;
import org.springframework.data.repository.CrudRepository;



public interface DoctorDao extends CrudRepository<Doctor, Integer> {
    
}