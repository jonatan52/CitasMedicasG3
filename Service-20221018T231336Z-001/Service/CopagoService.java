
package com.backend.citas.Service;

import com.backend.citas.Models.Copago;
import java.util.List;



public interface CopagoService {
    public Copago save(Copago copago);
    public void delete(Integer id);
    public Copago findById(Integer id);
    public List<Copago> findByAll();   
}
