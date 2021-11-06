package com.example.odkApprenant.controllers;

import com.example.odkApprenant.model.Admin;
import com.example.odkApprenant.services.AdminServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {
    @Autowired
    AdminServiceImp adminServiceImp;

    @PostMapping("/admin/save")
    public String addAdmin(@RequestBody Admin admin){
        this.adminServiceImp.saveAdmin(admin);
        return "L'administrateur ajouté avec succèss...";
    }

    @GetMapping("/admin/{id}")
    public Admin getAnAdmin(@PathVariable("id") Long id){
        return this.adminServiceImp.getAnAdmin(id);
    }

    @GetMapping("/admin/all")
    public List<Admin> getAllAdmin(){
        return this.adminServiceImp.getAllAdmin();
    }
}
