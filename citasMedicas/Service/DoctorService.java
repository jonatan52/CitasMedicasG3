package com.backend.citasMedicas.Service;

import com.backend.citasMedicas.Models.Doctor;
import java.util.List;

public interface DoctorService {
    public Doctor save(Doctor doctor);
    public void delete(Integer id);
    public Doctor findById(Integer id);
    public List<Doctor> findByAll();
}
