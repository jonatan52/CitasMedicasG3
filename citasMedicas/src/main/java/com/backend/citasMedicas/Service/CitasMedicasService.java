package com.backend.citasMedicas.Service;

import com.backend.citasMedicas.Models.CitasMedicas;
import java.util.List;

public interface CitasMedicasService {
    public CitasMedicas save(CitasMedicas citasMedicas);
    public void delete(Integer id);
    public CitasMedicas findById(Integer id);
    public List<CitasMedicas> findByAll();
}