
package com.backend.citas.Service;

import com.backend.citas.Models.CitasMedicas;
import java.util.List;



public interface CitasMedicasService {
    public CitasMedicas save(CitasMedicas citasMedicas);
    public void delete(Integer id);
    public CitasMedicas findById(Integer id);
    public List<CitasMedicas> findByAll();   
}
