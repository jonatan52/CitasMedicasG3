
package com.backend.citas.Service.Implement;

import com.backend.citas.Dao.DoctorDao;
import com.backend.citas.Models.Doctor;
import com.backend.citas.Service.DoctorService;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorDao doctorDao;



   @Override
    @Transactional(readOnly=false)
    public Doctor save(Doctor doctor) {
        return doctorDao.save(doctor);
    }



   @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        doctorDao.deleteById(id);
    }



   @Override
    @Transactional(readOnly=true)
    public Doctor findById(Integer id) {
        return doctorDao.findById(id).orElse(null);
    }



   @Override
    @Transactional(readOnly=true)
    public List<Doctor> findByAll() {
        return (List<Doctor>) doctorDao.findAll();
    }
}

