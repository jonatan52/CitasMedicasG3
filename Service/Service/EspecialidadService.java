
package com.backend.citas.Service;

import com.backend.citas.Models.Especialidad;
import java.util.List;



public interface EspecialidadService {
    public Especialidad save(Especialidad especialidad);
    public void delete(Integer id);
    public Especialidad findById(Integer id);
    public List<Especialidad> findByAll();   
}
