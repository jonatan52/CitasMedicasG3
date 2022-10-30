package com.backend.citasMedicas.Service;

import com.backend.citasMedicas.Models.Pacientes;
import java.util.List;

public interface PacientesService {
    public Pacientes save(Pacientes pacientes);
    public void delete(Integer id);
    public Pacientes findById(Integer id);
    public List<Pacientes> findByAll();
}