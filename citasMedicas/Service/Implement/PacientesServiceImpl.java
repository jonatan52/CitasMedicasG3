package com.backend.citasMedicas.Service.Implement;

import com.backend.citasMedicas.Dao.PacientesDao;
import com.backend.citasMedicas.Models.Pacientes;
import com.backend.citasMedicas.Service.PacientesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service
public class PacientesServiceImpl implements PacientesService {
    @Autowired
    private PacientesDao pacientesDao;

    @Override
    @Transactional(readOnly=false)
    public Pacientes save(Pacientes pacientes) {
        return pacientesDao.save(pacientes);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        pacientesDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public Pacientes findById(Integer id) {
        return pacientesDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Pacientes> findByAll() {
        return (List<Pacientes>) pacientesDao.findAll();
    }
    
}
