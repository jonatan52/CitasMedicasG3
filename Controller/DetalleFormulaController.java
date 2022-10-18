
package com.backend.citas.Controller;

import com.backend.citas.Models.DetalleFormula;
import com.backend.citas.Service.DetalleFormulaService;
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
@RequestMapping("/detalleFormula")
public class DetalleFormulaController {
    @Autowired
    private DetalleFormulaService detalleFormulaService;
    
    @PostMapping(value="/")
    public ResponseEntity<DetalleFormula> agregar(@RequestBody DetalleFormula detalleFormula){        
        DetalleFormula obj = detalleFormulaService.save(detalleFormula);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
   
    @DeleteMapping(value="/{id}")
    public ResponseEntity<DetalleFormula> eliminar(@PathVariable Integer id){
        DetalleFormula obj = detalleFormulaService.findById(id);
        if(obj!=null)
            detalleFormulaService.delete(id);
        else
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @PutMapping(value="/")
    public ResponseEntity<DetalleFormula> editar(@RequestBody DetalleFormula detalleFormula){
        DetalleFormula obj = detalleFormulaService.findById(detalleFormula.getIdFormula());
        if(obj!=null) {
            obj.setIdFormula(detalleFormula.getIdFormula());
            obj.setIdmedicamento(detalleFormula.getIdmedicamento());
            obj.setCantidad(detalleFormula.getCantidad());
            detalleFormulaService.save(obj);
        }
        else
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<DetalleFormula> consultarTodo(){
        return detalleFormulaService.findByAll();
    }
    
    @GetMapping("/list/{id}")
    public DetalleFormula consultaPorId(@PathVariable Integer id){
        return detalleFormulaService.findById(id);
    }
}
