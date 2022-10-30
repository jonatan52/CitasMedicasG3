package com.backend.citasMedicas.Service.Implement;

import com.backend.citasMedicas.Dao.DetalleFormulaDao;
import com.backend.citasMedicas.Models.DetalleFormula;
import com.backend.citasMedicas.Service.DetalleFormulaService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service
public class DetalleFormulaServiceImpl implements DetalleFormulaService {
    @Autowired
    private DetalleFormulaDao detalleFormulaDao;

    @Override
    @Transactional(readOnly=false)
    public DetalleFormula save(DetalleFormula detalleFormula) {
        return detalleFormulaDao.save(detalleFormula);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        detalleFormulaDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public DetalleFormula findById(Integer id) {
        return detalleFormulaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=true)
    public List<DetalleFormula> findByAll() {
        return (List<DetalleFormula>) detalleFormulaDao.findAll();
    }
    
}

