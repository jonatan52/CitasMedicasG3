package com.backend.citasMedicas.Service;

import com.backend.citasMedicas.Models.Formula;
import java.util.List;

public interface FormulaService {
    public Formula save(Formula formula);
    public void delete(Integer id);
    public Formula findById(Integer id);
    public List<Formula> findByAll();
}
