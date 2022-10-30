package com.backend.citasMedicas.Service;

import com.backend.citasMedicas.Models.Copago;
import java.util.List;

public interface CopagoService {
    public Copago save(Copago copago);
    public void delete(Integer id);
    public Copago findById(Integer id);
    public List<Copago> findByAll();
}