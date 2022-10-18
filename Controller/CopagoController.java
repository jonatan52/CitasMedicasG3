
package com.backend.citas.Controller;

import com.backend.citas.Models.Copago;
import com.backend.citas.Service.CopagoService;
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
@RequestMapping("/copago")
public class CopagoController {
    @Autowired
    private CopagoService copagoService;
    
    @PostMapping(value="/")
    public ResponseEntity<Copago> agregar(@RequestBody Copago copago){        
        Copago obj = copagoService.save(copago);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
   
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Copago> eliminar(@PathVariable Integer id){
        Copago obj = copagoService.findById(id);
        if(obj!=null)
            copagoService.delete(id);
        else
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @PutMapping(value="/")
    public ResponseEntity<Copago> editar(@RequestBody Copago copago){
        Copago obj = copagoService.findById(copago.getIdCopago());
        if(obj!=null) {
            obj.setIdCopago(copago.getIdCopago());
            obj.setPrecio(copago.getPrecio());
            copagoService.save(obj);
        }
        else
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<Copago> consultarTodo(){
        return copagoService.findByAll();
    }
    
    @GetMapping("/list/{id}")
    public Copago consultaPorId(@PathVariable Integer id){
        return copagoService.findById(id);
    }
}
