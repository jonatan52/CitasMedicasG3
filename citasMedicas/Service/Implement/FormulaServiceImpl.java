package com.backend.citasMedicas.Service.Implement;

import com.backend.citasMedicas.Dao.FormulaDao;
import com.backend.citasMedicas.Models.Formula;
import com.backend.citasMedicas.Service.FormulaService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service
public class FormulaServiceImpl implements FormulaService {
    @Autowired
    private FormulaDao formulaDao;

    @Override
    @Transactional(readOnly=false)
    public Formula save(Formula formula) {
        return formulaDao.save(formula);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        formulaDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public Formula findById(Integer id) {
        return formulaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Formula> findByAll() {
        return (List<Formula>) formulaDao.findAll();
    }
    
}
