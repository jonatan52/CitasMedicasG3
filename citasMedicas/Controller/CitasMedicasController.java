package com.backend.citasMedicas.Controller;

import com.backend.citasMedicas.Models.CitasMedicas;
import com.backend.citasMedicas.Service.CitasMedicasService;
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
@RequestMapping("/citasmedicas")
public class CitasMedicasController {
    @Autowired
    private CitasMedicasService citasMedicasService;
    
    @PostMapping(value="/")
    public ResponseEntity<CitasMedicas> agregar(@RequestBody CitasMedicas citasMedicas){        
        CitasMedicas obj = citasMedicasService.save(citasMedicas);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<CitasMedicas> eliminar(@PathVariable Integer id){ 
        CitasMedicas obj = citasMedicasService.findById(id); 
        if(obj!=null) 
            citasMedicasService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @PutMapping(value="/") 
    public ResponseEntity<CitasMedicas> editar(@RequestBody CitasMedicas citasMedicas){ 
        CitasMedicas obj = citasMedicasService.findById(citasMedicas.getIdCitasMedicas()); 
        if(obj!=null) {
            obj.setFecha(citasMedicas.getFecha());
            obj.setHora(citasMedicas.getHora());
            obj.setPacientes(citasMedicas.getPacientes());
            obj.setDoctor(citasMedicas.getDoctor());
            obj.setCopago(citasMedicas.getCopago());
            citasMedicasService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @GetMapping("/list")
    public List<CitasMedicas> consultarTodo(){
        return citasMedicasService.findByAll(); 
    } 
    @GetMapping("/list/{id}") 
    public CitasMedicas consultaPorId(@PathVariable Integer id){ 
        return citasMedicasService.findById(id); 
    }
    
}
