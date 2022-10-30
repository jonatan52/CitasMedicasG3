package com.backend.citasMedicas.Controller;
import com.backend.citasMedicas.Models.Especialidad;
import com.backend.citasMedicas.Service.EspecialidadService;
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
@RequestMapping("/especialidad")
public class EspecialidadController {
    @Autowired
    private EspecialidadService especialidadService;
    
    @PostMapping(value="/")
    public ResponseEntity<Especialidad> agregar(@RequestBody Especialidad especialidad){        
        Especialidad obj = especialidadService.save(especialidad);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Especialidad> eliminar(@PathVariable Integer id){ 
        Especialidad obj = especialidadService.findById(id); 
        if(obj!=null) 
            especialidadService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @PutMapping(value="/") 
    public ResponseEntity<Especialidad> editar(@RequestBody Especialidad especialidad){ 
        Especialidad obj = especialidadService.findById(especialidad.getIdEspecializacion()); 
        if(obj!=null) {
            obj.setNombreEspecializacion(especialidad.getNombreEspecializacion());
            
            especialidadService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @GetMapping("/list")
    public List<Especialidad> consultarTodo(){
        return especialidadService.findByAll(); 
    } 
    @GetMapping("/list/{id}") 
    public Especialidad consultaPorId(@PathVariable Integer id){ 
        return especialidadService.findById(id); 
    }
    
}