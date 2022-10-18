
package com.backend.citas.Service;

import com.backend.citas.Models.Medicamentos;
import java.util.List;



public interface MedicamentosService {
    public Medicamentos save(Medicamentos medicamentos);
    public void delete(Integer id);
    public Medicamentos findById(Integer id);
    public List<Medicamentos> findByAll();   
}
