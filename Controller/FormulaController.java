
package com.backend.citas.Controller;

import com.backend.citas.Models.Formula;
import com.backend.citas.Service.FormulaService;
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
@RequestMapping("/formula")
public class FormulaController {
    @Autowired
    private FormulaService formulaService;
    
    @PostMapping(value="/")
    public ResponseEntity<Formula> agregar(@RequestBody Formula formula){        
        Formula obj = formulaService.save(formula);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
   
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Formula> eliminar(@PathVariable Integer id){
        Formula obj = formulaService.findById(id);
        if(obj!=null)
            formulaService.delete(id);
        else
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @PutMapping(value="/")
    public ResponseEntity<Formula> editar(@RequestBody Formula formula){
        Formula obj = formulaService.findById(formula.getIdFormula());
        if(obj!=null) {
            obj.setIdFormula(formula.getIdFormula());
            obj.setFecha(formula.getFecha());
            obj.setHora(formula.getHora());
            obj.setIdPaciente(formula.getIdPaciente());
            obj.setIdDoctor(formula.getIdDoctor());
            formulaService.save(obj);
        }
        else
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<Formula> consultarTodo(){
        return formulaService.findByAll();
    }
    
    @GetMapping("/list/{id}")
    public Formula consultaPorId(@PathVariable Integer id){
        return formulaService.findById(id);
    }
}

