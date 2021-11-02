package com.example.odkApprenant.controllers;

import com.example.odkApprenant.model.Apprenant;
import com.example.odkApprenant.services.ApprenantServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ApprenantController {
    @Autowired
    private ApprenantServiceImp apprenantServiceImp;

    @GetMapping("")
    public String getStatus(){
        return "Ok";
    }

    @PostMapping("/save")
    public String saveApprenant(@RequestBody Apprenant apprenant){
        this.apprenantServiceImp.saveApprenant(apprenant);
        return "Enregistrement reussi...";
    }

    @PutMapping("/update/{id}")
    public String editApprenant(@PathVariable("id") Long id, @RequestBody Apprenant apprenant){
        this.apprenantServiceImp.editApprenant(id, apprenant);
        return "Apprenant modifié avec success...";
    }

    @GetMapping("/get")
    public List<Apprenant> getApprenantById(){
        return (List<Apprenant>) apprenantServiceImp.getAllApprenant();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAnApprenant(@PathVariable("id") Long id){
        this.apprenantServiceImp.deleteApprenant(id);
        return "Apprenant effacé avec succèss...";
    }

    @GetMapping("/auth/{login}&{password}")
    public Apprenant checkUser(@PathVariable("login") String login,
                               @PathVariable("password") String password){
        return this.apprenantServiceImp.getAuth(login, password);
    }
}
