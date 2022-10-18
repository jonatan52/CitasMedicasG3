
package com.backend.citas.Controller;

import com.backend.citas.Models.Pacientes;
import com.backend.citas.Service.PacientesService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/pacientes")
public class PacientesController {
    @Autowired
    private PacientesService pacienteService;
    
    @PostMapping(value="/")
    public ResponseEntity<Pacientes> agregar(@RequestBody Pacientes pacientes){        
        Pacientes obj = pacienteService.save(pacientes);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
   
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Pacientes> eliminar(@PathVariable Integer id){
        Pacientes obj = pacienteService.findById(id);
        if(obj!=null)
            pacienteService.delete(id);
        else
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @PutMapping(value="/")
    public ResponseEntity<Pacientes> editar(@RequestBody Pacientes pacientes){
        Pacientes obj = pacienteService.findById(pacientes.getIdPaciente());
        if(obj!=null) {
            obj.setIdPaciente(pacientes.getIdPaciente());
            obj.setNombrePaciente(pacientes.getNombrePaciente());
            obj.setApellidoPaciente1(pacientes.getApellidoPaciente1());
            obj.setApellidoPaciente2(pacientes.getApellidoPaciente2());
            obj.setEdadPaciente(pacientes.getEdadPaciente());
            obj.setCorreo(pacientes.getCorreo());
            obj.setGenero(pacientes.getGenero());
            obj.setTelefono(pacientes.getTelefono());
            obj.setDireccion(pacientes.getDireccion());
            obj.setEps(pacientes.getEps());
            pacienteService.save(obj);
        }
        else
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<Pacientes> consultarTodo(){
        return pacienteService.findByAll();
    }
    
    @GetMapping("/list/{id}")
    public Pacientes consultaPorId(@PathVariable Integer id){
        return pacienteService.findById(id);
    }
}

