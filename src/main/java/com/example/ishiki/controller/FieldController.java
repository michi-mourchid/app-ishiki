package com.example.ishiki.controller;


import com.example.ishiki.model.Field;
import com.example.ishiki.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/fields")
public class FieldController {

    @Autowired
    private FieldService fieldService;

    @GetMapping
    public List<Field> getAllFields(){
        return fieldService.getAllFields();
    }

    @GetMapping("/{id}")
    public Field getFieldById(@PathVariable Long id){
        return fieldService.getFieldById(id);
    }

    @PostMapping
    public Field createField(@RequestBody Field field){
        return fieldService.saveField(field);
    }

    @PutMapping
    public Field updateFieldById(@RequestBody Field field){
        return fieldService.saveField(field);
    }

    @DeleteMapping("/{id}")
    public void deleteFieldById(@PathVariable Long id){
        fieldService.deleteFieldById(id);
    }


}
