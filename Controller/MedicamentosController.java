
package com.backend.citas.Controller;

import com.backend.citas.Models.Medicamentos;
import com.backend.citas.Service.MedicamentosService;
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
@RequestMapping("/medicamentos")
public class MedicamentosController {
    @Autowired
    private MedicamentosService medicamentosService;
    
    @PostMapping(value="/")
    public ResponseEntity<Medicamentos> agregar(@RequestBody Medicamentos medicamentos){        
        Medicamentos obj = medicamentosService.save(medicamentos);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
   
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Medicamentos> eliminar(@PathVariable Integer id){
        Medicamentos obj = medicamentosService.findById(id);
        if(obj!=null)
            medicamentosService.delete(id);
        else
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @PutMapping(value="/")
    public ResponseEntity<Medicamentos> editar(@RequestBody Medicamentos medicamentos){
        Medicamentos obj = medicamentosService.findById(medicamentos.getIdMedicamento());
        if(obj!=null) {
            obj.setIdMedicamento(medicamentos.getIdMedicamento());
            obj.setNombreMedicamento(medicamentos.getNombreMedicamento());
            medicamentosService.save(obj);
        }
        else
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<Medicamentos> consultarTodo(){
        return medicamentosService.findByAll();
    }
    
    @GetMapping("/list/{id}")
    public Medicamentos consultaPorId(@PathVariable Integer id){
        return medicamentosService.findById(id);
    }
}
