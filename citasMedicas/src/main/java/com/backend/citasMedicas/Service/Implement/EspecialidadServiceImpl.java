package com.backend.citasMedicas.Service.Implement;

import com.backend.citasMedicas.Dao.EspecialidadDao;
import com.backend.citasMedicas.Models.Especialidad;
import com.backend.citasMedicas.Service.EspecialidadService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {
    @Autowired
    private EspecialidadDao especialidadDao;

    @Override
    @Transactional(readOnly=false)
    public Especialidad save(Especialidad especialidad) {
        return especialidadDao.save(especialidad);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        especialidadDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public Especialidad findById(Integer id) {
        return especialidadDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Especialidad> findByAll() {
        return (List<Especialidad>) especialidadDao.findAll();
    }
    
}
