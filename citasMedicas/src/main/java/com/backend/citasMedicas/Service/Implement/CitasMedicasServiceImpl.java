package com.backend.citasMedicas.Service.Implement;

import com.backend.citasMedicas.Dao.CitasMedicasDao;
import com.backend.citasMedicas.Models.CitasMedicas;
import com.backend.citasMedicas.Service.CitasMedicasService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service
public class CitasMedicasServiceImpl implements CitasMedicasService {
    @Autowired
    private CitasMedicasDao citasMedicasDao;

    @Override
    @Transactional(readOnly=false)
    public CitasMedicas save(CitasMedicas citasMedicas) {
        return citasMedicasDao.save(citasMedicas);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        citasMedicasDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public CitasMedicas findById(Integer id) {
        return citasMedicasDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=true)
    public List<CitasMedicas> findByAll() {
        return (List<CitasMedicas>) citasMedicasDao.findAll();
    }
    
}
