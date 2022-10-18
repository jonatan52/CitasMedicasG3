
package com.backend.citas.Service.Implement;

import com.backend.citas.Dao.MedicamentosDao;
import com.backend.citas.Models.Medicamentos;
import com.backend.citas.Service.MedicamentosService;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class MedicamentosServiceImpl implements MedicamentosService {
    @Autowired
    private MedicamentosDao medicamentosDao;



   @Override
    @Transactional(readOnly=false)
    public Medicamentos save(Medicamentos medicamentos) {
        return medicamentosDao.save(medicamentos);
    }



   @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        medicamentosDao.deleteById(id);
    }



   @Override
    @Transactional(readOnly=true)
    public Medicamentos findById(Integer id) {
        return medicamentosDao.findById(id).orElse(null);
    }



   @Override
    @Transactional(readOnly=true)
    public List<Medicamentos> findByAll() {
        return (List<Medicamentos>) medicamentosDao.findAll();
    }
}


