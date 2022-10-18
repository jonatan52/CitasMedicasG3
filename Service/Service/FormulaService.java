
package com.backend.citas.Service;

import com.backend.citas.Models.Formula;
import java.util.List;



public interface FormulaService {
    public Formula save(Formula formula);
    public void delete(Integer id);
    public Formula findById(Integer id);
    public List<Formula> findByAll();   
}
