package com.example.odkApprenant.controllers;

import com.example.odkApprenant.model.Formateur;
import com.example.odkApprenant.services.FormateurServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FormateurController {
    @Autowired
    FormateurServiceImp formateurServiceImp;

    @PostMapping("/frmt/add")
    public String addFormateur(@RequestBody Formateur formateur){
        this.formateurServiceImp.addFormateur(formateur);
        return "Formateur / (trice) ajouté(e) avec succès...";
    }

    @GetMapping("/frmt/get/{id}")
    public Formateur getAnFormateur(@PathVariable("id") Long id){
        return this.formateurServiceImp.getAFormateur(id);
    }

    @GetMapping("/frmt/all")
    public List<Formateur> getAllFormateur(){
        return this.formateurServiceImp.getAllFormateur();
    }

}
