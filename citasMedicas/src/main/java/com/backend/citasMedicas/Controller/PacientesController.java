package com.backend.citasMedicas.Controller;
import com.backend.citasMedicas.Models.Pacientes;
import com.backend.citasMedicas.Service.PacientesService;
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
    private PacientesService pacientesService;
    
    @PostMapping(value="/")
    public ResponseEntity<Pacientes> agregar(@RequestBody Pacientes pacientes){        
        Pacientes obj = pacientesService.save(pacientes);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Pacientes> eliminar(@PathVariable Integer id){ 
        Pacientes obj = pacientesService.findById(id); 
        if(obj!=null) 
            pacientesService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
   
    @PutMapping(value="/") 
    public ResponseEntity<Pacientes> editar(@RequestBody Pacientes pacientes){ 
       Pacientes obj = pacientesService.findById(pacientes.getIdPaciente());
        if(obj!=null) {
            obj.setNombrePaciente(pacientes.getNombrePaciente());
            obj.setApellidoPaciente1(pacientes.getApellidoPaciente1());
            obj.setApellidoPaciente1(pacientes.getApellidoPaciente2());
            obj.setEdad(pacientes.getEdad());
            obj.setGenero(pacientes.getGenero());
            obj.setTelefono(pacientes.getTelefono());
            obj.setDireccion(pacientes.getDireccion());
            obj.setCorreo(pacientes.getCorreo());
            obj.setEps(pacientes.getEps());
            
            
            pacientesService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    
    @GetMapping("/list")
    public List<Pacientes> consultarTodo(){
        return pacientesService.findByAll(); 
    } 
    @GetMapping("/list/{id}") 
    public Pacientes consultaPorId(@PathVariable Integer id){ 
        return pacientesService.findById(id); 
    }
}