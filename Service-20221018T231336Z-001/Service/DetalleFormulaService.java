
package com.backend.citas.Service;

import com.backend.citas.Models.DetalleFormula;
import java.util.List;


public interface DetalleFormulaService {
    public DetalleFormula save(DetalleFormula detalleFormula);
    public void delete(Integer id);
    public DetalleFormula findById(Integer id);
    public List<DetalleFormula> findByAll();   
}
