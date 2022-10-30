package com.backend.citasMedicas.Service;

import com.backend.citasMedicas.Models.DetalleFormula;
import java.util.List;

public interface DetalleFormulaService {
    public DetalleFormula save(DetalleFormula detalleFormula);
    public void delete(Integer id);
    public DetalleFormula findById(Integer id);
    public List<DetalleFormula> findByAll();
}
