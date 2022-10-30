package com.backend.citasMedicas.Controller;
import com.backend.citasMedicas.Models.Doctor;
import com.backend.citasMedicas.Service.DoctorService;
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
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    
    @PostMapping(value="/")
    public ResponseEntity<Doctor> agregar(@RequestBody Doctor doctor){        
        Doctor obj = doctorService.save(doctor);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Doctor> eliminar(@PathVariable Integer id){ 
        Doctor obj = doctorService.findById(id); 
        if(obj!=null) 
            doctorService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @PutMapping(value="/") 
    public ResponseEntity<Doctor> editar(@RequestBody Doctor doctor){ 
        Doctor obj = doctorService.findById(doctor.getIdDoctor()); 
        if(obj!=null) {
            obj.setNombreDoctor(doctor.getNombreDoctor());
            obj.setApellidoDoctor1(doctor.getApellidoDoctor1());
            obj.setApellidoDoctor2(doctor.getApellidoDoctor2());
            obj.setEdadDoctor(doctor.getEdadDoctor());
            obj.setCorreo(doctor.getCorreo());
            obj.setIdEspecializacion(doctor.getIdEspecializacion());
            obj.setTelefono(doctor.getTelefono());
            
            doctorService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @GetMapping("/list")
    public List<Doctor> consultarTodo(){
        return doctorService.findByAll(); 
    } 
    @GetMapping("/list/{id}") 
    public Doctor consultaPorId(@PathVariable Integer id){ 
        return doctorService.findById(id); 
    }
    
}